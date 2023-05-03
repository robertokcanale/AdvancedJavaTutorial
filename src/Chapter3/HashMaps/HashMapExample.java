package Chapter3.HashMaps;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        //THE ORDER OF ELEMENTS IS NOT THE SAME AS THE ONE I PUT THEM IN
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 242462);
        phonebook.put("Brenda", 21005);
        phonebook.put("Johns", 792462);
        phonebook.put(null, 0000);
        System.out.println(phonebook);

        if(phonebook.containsKey("Brenda")){
            phonebook.remove("Brenda");
        }
        System.out.println(phonebook);
        phonebook.clear(); //clearing it up
        System.out.println(phonebook);

    }
    }
