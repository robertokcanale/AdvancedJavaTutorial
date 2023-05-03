package Chapter3.LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapExample {
    public static void main(String[] args) {
        //THE ORDER IS PRESERVED
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(5, 0.75f, false); // 5= how big it can be 0.75= Load Factor, how much full it has to be to expand, here it is 75%
        phonebook.put("Kevin", 242462);
        phonebook.put("Brenda", 21005);
        phonebook.put("Johns", 792462);
        phonebook.put(null, 0000);
        System.out.println(phonebook);

        if(phonebook.containsKey("Brenda")){
            phonebook.remove("Brenda");
        }
        System.out.println(phonebook);

        for(Map.Entry<String, Integer> entry: phonebook.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        phonebook.clear(); //clearing it up
        System.out.println(phonebook);

    }
    }
