package Chapter2.SubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Building building = new Building();
        Office office = new Office();

        build(building);
        build(office);

        // Because of substitution principles, I can add offices to a list of buildings,
        // as offices are subtypes of building
        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);

        //cannot add Buildings to Offices!
//        List<Office> offices = new ArrayList<>();
//        buildings.add(new Office());
//        buildings.add(new Office());
//        printBuildings(offices);


    }
    static void build(Building building){
        System.out.println("Constructing a New: "+ building.toString());
    }

    static void printBuildings(List<Building> buildings){
        for (int i = 0; i < buildings.size(); i=0){
            System.out.println("Constructing a New: "+ buildings.get(i).toString());
        }
    }
}
