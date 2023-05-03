import java.util.ArrayList;
import java.util.List;

public class GenericsExampleArray {
    static Character[] charArray = {'h', 'e', 'l', 'l', 'l', 'o'};
    static Integer[] intArray = {1,2,3,4,5};
    static Boolean[] boolArray = {true, false, true};

    //Passes all elements into the list
    //Create a GENERIC Variable with Local Scope = <T>, can only be used inside arrayToList
    //<T> is a GENERIC type, I do not care what it is
    public static <T> List<T> arrayToList(T[] array, List<T> list){
        for (T object : array){
            list.add(object);
        }
        return list;
    }
    public static void main(String[] args){
        List<Character> characterList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        System.out.println(intList.get(3));
        System.out.println(boolList.get(1));
        System.out.println(characterList.get(2));
    }
}
