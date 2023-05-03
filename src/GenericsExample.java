import java.util.ArrayList;
import java.util.List;
public class GenericsExample {

    public static void main(String[] args){

        // NO GENERICS
        List names = new ArrayList();
        names.add("Jelly");
        String name = (String) names.get(0); // STRING CAST
        System.out.println("First name: " + name);

        //GENERICS
        List <String> names2 = new ArrayList<>(); // SPECIFYING IT IS A LIST OF STRING
        names2.add("Kelly");
        String name2 =  names2.get(0);
        System.out.println("First name: " + name2);

    }
}
