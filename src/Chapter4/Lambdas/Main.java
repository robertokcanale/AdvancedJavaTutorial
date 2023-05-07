package Chapter4.Lambdas;

public class Main {
    public static void main(String[] args) {
        GreetingsMessage gm = new GreetingsMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        gm.greet("Roby");

        //LAMBDA FUNCTION
        //Are a way of simply implementing Functional Interfaces
        //Allows to do it with LESS CODE
        GreetingsMessage gm2 = (name)-> {   //Inside the brackets you put the ARGUMENTS that go in the function
            System.out.println("Hello " + name);  //BODY of the Method
        };
        gm2.greet("Roberto");

        MessagePrinter mp = () -> {
            System.out.println("This is a message");
        };

        mp.printMessagee();
    }
}
