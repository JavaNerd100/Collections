package CollectionsFrameWork.Maps;


import java.util.HashMap;
import java.util.Map;

/** The Map interface specifies a contract to implement collections of elements,
 *  that are in the form of (key,value) pairs.
 *
 *  Since the kind of elements stored in a map ( (key, value) pairs) are different
 *  from any other collection categories in Java, the Map interface is unique.
 *  So unique, that it even does not extend the Collection interface !
 *
 * The interface definition looks something like:
 *
 *      public interface Map<K, V> {
 *       //Method Declarations
 *       }
 */

public class MapInterface {

    public static void main(String[] args) {

        Map<String,Integer> map = Map.of("A",3, "B", 5, "Z", 10);
        System.out.println(map);

        //Basic Methods
        //1) get() method this returns the value of the required element
        System.out.println("Get() method output -->");
        System.out.println(map.get("Z"));
        System.out.println(map.get("B"));
        System.out.println(map.get("A"));

        //2) size() method it returns total no of (key,Value) pairs are present
        System.out.println("size() method output -->");
        System.out.println(map.size());

        //3) isEmpty() method checks it is empty or not
        System.out.println("isEmpty() method output -->");
        System.out.println(map.isEmpty());

        //4) containsKey() method checks required keys are present or not
        System.out.println("containsKey() method output -->");
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("G"));

        //5) containsValue() method checks required values are present or not
        System.out.println("containsValue() method output -->");
        System.out.println(map.containsValue(3));
        System.out.println(map.containsValue(5));

        //6) keySet() method returns the all keys that is present in the map
        System.out.println("keySet() method output -->");
        System.out.println(map.keySet());

        //7) values() method returns all the values that is present in the map
        System.out.println("values() method output -->");
        System.out.println(map.values());

        //To be able to add values to a map,we have to create HashMap
        HashMap<String,Integer> hashMap = new HashMap<>(map);

        hashMap.put("F",5);
        hashMap.put("Z",11);

        System.out.println("map -->");
        System.out.println(map);

        System.out.println("Hashmap -->");
        System.out.println(hashMap);



    }
}
