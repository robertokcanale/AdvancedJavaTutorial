package Chapter4.MethodReferences;

import Chapter4.Lambdas.GreetingsMessage;
import Chapter4.Lambdas.MessagePrinter;

public class Main {
    public static void main(String[] args) {
       Square s = new Square(4);

       //Ovverride the GetArea method using a Lambda function
       Shapes shape = (Square square) -> {return square.calculateArea();};

       System.out.println("Area " + shape.getArea(s));

       //USE A METHOD REFERENCE// I can make it EVEN FASTER like this
        //Shorter and simpler
       Shapes shape2 = Square::calculateArea;
       System.out.println("Area " + shape2.getArea(s));

    }
}
