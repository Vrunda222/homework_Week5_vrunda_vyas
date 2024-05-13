package homework_week5;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Program9_HashMap {
    public static void main(String[] args) {
        hashMap();
    }

    public static void hashMap() {
        Map<String, Integer> people = new HashMap();
        people.put("Vrunda", 1);
        people.put("Soniya", 2);
        people.put("Dhwani", 3);
        people.put("Varsha", 4);
        people.put("Manish", 5);
        people.put("Jigar", 6);

        for (Map.Entry<String, Integer> ppl : people.entrySet()) {
            System.out.println(ppl.getKey() + " " + ppl.getValue());
        }
    }
}
