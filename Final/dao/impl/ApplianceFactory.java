package by.tc.task01.dao.impl;

import java.util.Map;

import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;

public class ApplianceFactory {

    static Appliance newAppliance(Map<String, Object> parametres) throws DAOException {
	Appliance newAppliance = null;
	String applianceType = (String) parametres.get("Appliance");

	switch (applianceType) {

	case "Laptop":
	    newAppliance = createLaptop(parametres);
	    break;

	case "Oven":
	    newAppliance = createOven(parametres);
	    break;

	case "Refrigerator":
	    newAppliance = createRefrigerator(parametres);
	    break;

	case "Speakers":
	    newAppliance = createSpeakers(parametres);
	    break;

	case "TabletPC":
	    newAppliance = createTabletPC(parametres);
	    break;

	case "VacuumCleaner":
	    newAppliance = createVacuumCleaner(parametres);
	    break;

	default:
	    throw new DAOException();
	}
	
	return newAppliance;
    }

    private static Laptop createLaptop(Map<String, Object> parametres) {
	String applianceType = (String) parametres.get("Appliance");
	double batteryCapacity = Double
		.parseDouble((String) parametres.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()));
	String os = (String) parametres.get(SearchCriteria.Laptop.OS.toString());
	double memoryRom = Double.parseDouble((String) parametres.get(SearchCriteria.Laptop.MEMORY_ROM.toString()));
	double systemMemory = Double
		.parseDouble((String) parametres.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()));
	double cpu = Double.parseDouble((String) parametres.get(SearchCriteria.Laptop.CPU.toString()));
	double displayInchs = Double
		.parseDouble((String) parametres.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString()));

	return new Laptop(applianceType, batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
    }

    private static Oven createOven(Map<String, Object> parametres) {
	String applianceType = (String) parametres.get("Appliance");
	double powerConsumption = Double
		.parseDouble((String) parametres.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()));
	double weight = Double.parseDouble((String) parametres.get(SearchCriteria.Oven.WEIGHT.toString()));
	double capacity = Double.parseDouble((String) parametres.get(SearchCriteria.Oven.CAPACITY.toString()));
	double depth = Double.parseDouble((String) parametres.get(SearchCriteria.Oven.DEPTH.toString()));
	double height = Double.parseDouble((String) parametres.get(SearchCriteria.Oven.HEIGHT.toString()));
	double width = Double.parseDouble((String) parametres.get(SearchCriteria.Oven.WIDTH.toString()));

	return new Oven(applianceType, powerConsumption, weight, capacity, depth, height, width);

    }

    private static Refrigerator createRefrigerator(Map<String, Object> parametres) {
	String applianceType = (String) parametres.get("Appliance");
	double powerConsumption = Double
		.parseDouble((String) parametres.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()));
	double weight = Integer.parseInt((String) parametres.get(SearchCriteria.Refrigerator.WEIGHT.toString()));
	double freezerCapacity = Double
		.parseDouble((String) parametres.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()));
	double overallCapacity = Double
		.parseDouble((String) parametres.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()));
	double height = Double.parseDouble((String) parametres.get(SearchCriteria.Refrigerator.HEIGHT.toString()));
	double width = Double.parseDouble((String) parametres.get(SearchCriteria.Refrigerator.WIDTH.toString()));

	return new Refrigerator(applianceType, powerConsumption, weight, freezerCapacity, overallCapacity, height,
		width);
    }

    private static Speakers createSpeakers(Map<String, Object> parametres) {
	String applianceType = (String) parametres.get("Appliance");
	double powerConsumption = Double
		.parseDouble((String) parametres.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()));
	double numberOfSpeakers = Double
		.parseDouble((String) parametres.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()));
	String frequencyRange = (String) parametres.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString());
	double cordLength = Double.parseDouble((String) parametres.get(SearchCriteria.Speakers.CORD_LENGTH.toString()));

	return new Speakers(applianceType, powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    private static TabletPC createTabletPC(Map<String, Object> parametres) {
	String applianceType = (String) parametres.get("Appliance");
	double batteryCapacity = Double
		.parseDouble((String) parametres.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()));
	double displayInches = Double
		.parseDouble((String) parametres.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()));
	double memoryRom = Double.parseDouble((String) parametres.get(SearchCriteria.TabletPC.MEMORY_ROM.toString()));
	double flashMemoryCapasity = Double
		.parseDouble((String) parametres.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()));
	String color = (String) parametres.get(SearchCriteria.TabletPC.COLOR.toString());

	return new TabletPC(applianceType, batteryCapacity, displayInches, memoryRom, flashMemoryCapasity, color);
    }

    private static VacuumCleaner createVacuumCleaner(Map<String, Object> parametres) {
	String applianceType = (String) parametres.get("Appliance");
	double powerConsumption = Double
		.parseDouble((String) parametres.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()));
	String filterType = (String) parametres.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString());
	String bagType = (String) parametres.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString());
	String wandType = (String) parametres.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString());
	double motorSpeeadRegulation = Double
		.parseDouble((String) parametres.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()));
	double cleaningWidth = Double
		.parseDouble((String) parametres.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()));

	return new VacuumCleaner(applianceType, powerConsumption, filterType, bagType, wandType, motorSpeeadRegulation,
		cleaningWidth);
    }
}
