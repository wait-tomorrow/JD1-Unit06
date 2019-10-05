package by.tc.task01.service.impl;

import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) {
	if (!Validator.criteriaValidator(criteria)) {
	    return null;
	}
	
	DAOFactory factory = DAOFactory.getInstance();
	ApplianceDAO applianceDAO = factory.getApplianceDAO();

	List<Appliance> appliance = null;
	try {
	    appliance = applianceDAO.find(criteria);
	} catch (DAOException e) {
	    e.printStackTrace();
	}

	return appliance;
    }
}
