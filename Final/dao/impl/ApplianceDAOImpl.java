package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {
    private static final String FILE = "resources\\appliances_db.txt";

    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {

	List<Appliance> findAppliance = new ArrayList<Appliance>();
	String groupSearchName = criteria.getGroupSearchName();
	Map<String, Object> params;

	try {
	    BufferedReader reader = new BufferedReader(new FileReader(FILE));

	    String line;
	    while ((line = reader.readLine()) != null) {
		String applianceType = line.split(" ")[0];

		if (groupSearchName.equals(applianceType)) {
		    params = getCriteria(line);

		    if (compareCriteria(params, criteria.getCriteria())) {
			findAppliance.add(ApplianceFactory.newAppliance(params));
		    }
		}
	    }
	    
	    reader.close();
	} catch (IOException e) {
	    throw new DAOException(e);
	}
	return findAppliance;
    }

    private Map<String, Object> getCriteria(String line) {
	Map<String, Object> criteria = new HashMap<String, Object>();
	String[] params = line.split("\\s?[,:;]?\\s+");

	criteria.put("Appliance", params[0]);

	for (int i = 1; i < params.length; i++) {
	    criteria.put(params[i].split("=")[0], params[i].split("=")[1]);
	}
	
	return criteria;
    }

    private boolean compareCriteria(Map<String, Object> parametres, Map<String, Object> criteria) {
	boolean isParam = true;

	for (Map.Entry<String, Object> entry : criteria.entrySet()) {
	    String st = entry.getKey();
	    if (!(criteria.get(st).toString()).equals(parametres.get(st))) {
		isParam = false;
		break;
	    }
	}
	return isParam;
    }
}