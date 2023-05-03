package Chapter2.Generics;

public class VairableLengthArgExample {

    public static void main(String[] args){
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Strawberries";
        String item4 = "Pears";

        String [] shoppingList = {"Bread", "Milk", "Eggs", "Bananas"};
        printShoppingList(item1, item2, item3, item4);
        printShoppingList(shoppingList);
    }

    // VARARGS to provide the methid with variable length of arguments, done with ...
    // SO I can pass 0, 1, 2 or a list of argument
    private static void printShoppingList (String... list){ // This is aa VarArgs  method
        System.out.println("SHOPPING LIST");
        for (int i=0; i<list.length; i++){
            System.out.println(i + ":" + list[i]);
        }
        System.out.println(" ");

    }
}
