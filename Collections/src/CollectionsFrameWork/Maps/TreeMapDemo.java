package CollectionsFrameWork.Maps;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Z",5);
        treeMap.put("A",31);
        treeMap.put("F",5);
        treeMap.put("L",110);
        System.out.println(treeMap);
    // TreeMap implement NavigableMap interface as well

    // 1) higherKey()
        System.out.println("higherKey() method output -->");
        System.out.println(treeMap.higherKey("A"));
        System.out.println(treeMap.higherKey("F"));

    // 2) lowerKey()
        System.out.println("lowerKey() method output -->");
        System.out.println(treeMap.lowerKey("A"));
        System.out.println(treeMap.lowerKey("F"));

    // 3) floorKey()
        System.out.println("floorKey() method output -->");
        System.out.println(treeMap.floorKey("A"));
        System.out.println(treeMap.floorKey("F"));

    // 4) ceilingKey()
        System.out.println("ceilingKey() method output -->");
        System.out.println(treeMap.ceilingKey("A"));
        System.out.println(treeMap.ceilingKey("F"));

    // 5) firstEntry() or lastEntry()
        System.out.println("first entry of treeMap --> "+treeMap.firstEntry());
        System.out.println("last entry of treeMap --> "+treeMap.lastEntry());

    // 6) subMap()
        System.out.println("subMap() method outputs --> ");
        System.out.println(treeMap.subMap("A","Z"));
        System.out.println(treeMap.subMap("A",true,"Z",true));


    }
}
