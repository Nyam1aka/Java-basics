import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        
        HashMap <String, Double> map = new HashMap <> ();

        map.put("Apple", 3.50);
        map.put("Orange", 1.50);
        map.put("Mango", 0.75);
        map.put("StrawBerry", 2.50);
        map.put("Watermelon", 0.50);

       // map.remove("Mango"); // To remove an ite from the hashmap

       // We use .get method to get the value associated with a particular key
        System.out.println(map.get("Watermelon"));

        //To check if a key exists we use .containsKey method

        System.out.println(map.containsKey("Mango"));

        //To check for values we use .containsValue method

        System.out.println(map.containsValue(2.50));

        //We use map.size to get the size of the Hashmap

        System.out.println(map.size());

        System.out.println(map); //this returns all the keys and value unformatted but we can use foreach 

        for (String  key : map.keySet()) {
            System.out.println(key + " : $" +  map.get(key));
            
        }
    }
}