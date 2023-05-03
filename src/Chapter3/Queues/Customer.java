package Chapter3.Queues;

public class Customer {
    private boolean hasBeenServed;
    private String name;
    public Customer(String name) {
        this.hasBeenServed = false;
        this.name = name;
    }

    public void serve(){
        this.hasBeenServed = true;
        System.out.println(name + "has been served.");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "hasBeenServed=" + hasBeenServed +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean isHasBeenServed() {
        return hasBeenServed;
    }

    public void setHasBeenServed(boolean hasBeenServed) {
        this.hasBeenServed = hasBeenServed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
