package Chapter2.Wildcards;

import java.util.ArrayList;
import java.util.List;

// Use: EXTEND for class derived from a another class, SUPER for SUPERCLASSES of that class
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
        buildings.add(new Building());
        printBuildings(buildings);

        //cannot Print Offices as buildings!
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        //cannot Print Houses as buildings!
        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
        printBuildings(offices);


    }
    static void build(Building building){
        System.out.println("Constructing a New: "+ building.toString());
    }

    //USING A WILDCARD = ? extends Class
    //means I can Pass ANY TYPE that extends the building class
    //i.e. ANY class that extends building
    static void printBuildings(List<? extends Building> buildings){
        for (int i = 0; i < buildings.size(); i=0){
            System.out.println("Constructing a New: "+ buildings.get(i).toString() + " " + (i+1));
        }
        System.out.println();
    }
    //USING A WILDCARD = ? super Class
    //Defineing the type of list
    //means I can Pass ANY TYPE that is SUPERCLASS the house class
    //i.e. any class from which HOUSE is derived
    static void addHouseToList(List<? super House> buildings){
        buildings.add(new House());
        System.out.println();
    }
}
