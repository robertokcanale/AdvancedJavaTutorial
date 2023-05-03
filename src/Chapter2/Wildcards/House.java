package Chapter2.Wildcards;

public class House extends Building {
    public int numberOfRooms = 10;
    public House() {
    }
    @Override
    public String toString() {
        return ("House");
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
