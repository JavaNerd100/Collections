package CollectionsFrameWork.Sets;

import java.util.Set;
import java.util.TreeSet;

/** Super-Interfaces
 * Set
 * NavigableSet
 */
public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>(Set.of(10,9,0,13,29,50));

   //   floor() method is inclusive
   //   lower() method is exclusive
        System.out.println("floor() method and lower() method output -->");
        System.out.println( numbers.floor(13));
        System.out.println( numbers.lower(13));
        System.out.println( numbers.floor(9));
        System.out.println( numbers.lower(9));

   //   ceiling() method is inclusive
   //   higher() method is exclusive
        System.out.println("ceiling() method and higher() method output -->");
        System.out.println( numbers.ceiling(13));
        System.out.println( numbers.higher(13));
        System.out.println( numbers.ceiling(9));
        System.out.println( numbers.higher(9));

   // subSet(Object,Object) method is only Lower inclusive
   // so left bound is like lower() and right bound is like higher
        System.out.println("subSet() method output -->");
        System.out.println(numbers.subSet(20,80));
        System.out.println(numbers.subSet(20,50));

   // The overloaded version  subSet(Object, boolean, Object, boolean)
   // can be used to configure lower-and upper inclusiveness of the returned subset.
        System.out.println("subSet() overloaded method output -->");
        System.out.println(numbers.subSet(20,true,80,true));
        System.out.println(numbers.subSet(20,false,50,false));

   //  headSet() returns the subset of elements preceding the given element value.
   //  tailsSet() returns the subset ofelements succeeding the given element value.
        System.out.println("headSet() and tailSet() method output -->");
        System.out.println(numbers.headSet(80));
        System.out.println(numbers.tailSet(20));




    }
}
