package CollectionsFrameWork.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**  The Java collection classes that implement the Map interface are:
 * HashMap
 * HashTable
 * LinkedHashMap
 * TreeMap
 */

public class MapImplementation {

    public static void main(String[] args) {

    // 1) HashMap
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Z",5);
        hashMap.put("A",31);
        hashMap.put("F",5);
        hashMap.put("L",110);
    // HashMap elements are not guaranteed to be stored in the insertion order or in the sorted order of keys.
        System.out.println("hashmap -->" + hashMap);

    // 2) LinkedHashMap
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Z",5);
        linkedHashMap.put("A",31);
        linkedHashMap.put("F",5);
        linkedHashMap.put("L",110);
    // LinkedHashMap elements are stored in inserted order.
        System.out.println("LinkedHashMap -->" + linkedHashMap);

   //   3) TreeMap
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Z",5);
        treeMap.put("A",31);
        treeMap.put("F",5);
        treeMap.put("L",110);
   //  TreeMap elements are stored in the natural sorted order of the keys.
        System.out.println("TreeMap -->" + treeMap);



    }
}
