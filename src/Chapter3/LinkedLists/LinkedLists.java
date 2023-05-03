package Chapter3.LinkedLists;

import java.util.LinkedList;
//FASTER but take up MORE MEMEORY that ArrayLists
//In General, Array Lists are better.
//Only way is to add or remove a lot of items in the middle, the linked list is better
public class LinkedLists {
    public static void main(String[] args){
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("D");
        myList.add("B");
        myList.add("C");
        myList.add(1, "C"); //adding at index 1
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);
    }
}
