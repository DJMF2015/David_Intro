import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap<String, String>();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");
    //When you store a value in a HashMap, it will always store an object,
    // rather than a primitive type. Take a look at the following code.
        System.out.println(favouriteFruits.get("Alice"));
        System.out.println(favouriteFruits.containsValue("Banana"));
;        HashMap<String, Integer> address = new HashMap <String, Integer>();
        address.put("edinburgh", 100); address.put("glasgow", 200); address.put("london", 300);
        address.put("chennai", 700000000);
        System.out.println(address.keySet());
        System.out.println(address.size());
        System.out.println(address.get("glasgow"));

    }
}
