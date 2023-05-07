package Chapter4.Lambdas;

//Functional Interfaces implement only one abstract method.
//Functional Interface allow to pass Java code around as DATA
@FunctionalInterface
public interface GreetingsMessage {
    public abstract void greet (String name); //Abstract = can be overridden
}
