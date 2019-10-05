package by.tc.task01.service.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {
	String categoria = criteria.getGroupSearchName();

	switch (categoria) {
	case "Oven":
	    return validateOven(criteria);
	case "Laptop":
	    return true;
	case "Refrigerator":
	    return true;
	case "VacuumCleaner":
	    return true;
	case "TabletPC":
	    return true;
	case "Speakers":
	    return true;
	default:
	    return false;
	}
    }

    private static boolean validateOven(Criteria criteria) {
	Map<String, String> ovenParams = new HashMap<>();
	ovenParams.put(Oven.POWER_CONSUMPTION.toString(), "[0-9]{3,4}");
	ovenParams.put(Oven.WEIGHT.toString(), "[0-9]{2,3}");
	ovenParams.put(Oven.CAPACITY.toString(), "[0-9]{2,3}");
	ovenParams.put(Oven.DEPTH.toString(), "[0-9]{2,3}");
	ovenParams.put(Oven.HEIGHT.toString(), "[0-9]{2,3}\\.[0-9]");
	ovenParams.put(Oven.WIDTH.toString(), "[0-9]{2,3}");

	Set<String> keys = criteria.getCriteria().keySet();
	for (String key : keys) {
	    String regex = ovenParams.get(key);
	    String params = criteria.getCriteria().get(key) + "";

	    if (!Pattern.matches(regex, params)) {
		return false;
	    }
	}
	return true;
    }
}