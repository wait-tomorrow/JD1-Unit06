package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliance) {
	if(appliance == null) {
	    System.out.println("Ничего не найдено");
	    
	    return;
	}
	
	for (Appliance app : appliance) {
	    System.out.println(app);
	}
    }
}
