package CollectionsFrameWork.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/** Set Implementation
 * HashSet
 * LinkedHashSet
 * TreeSet
 */

public class SetImplementation {

    public static void main(String[] args) {

        Set<Integer> numberHashSet = new HashSet<>();
        numberHashSet.add(100);
        numberHashSet.add(400);
        numberHashSet.add(500);
        numberHashSet.add(300);
        numberHashSet.add(200);

     //  In a HashSet elements are neither stored in the order of insertion, nor in sorted order
        System.out.println("HashSet --> " + numberHashSet);


        Set<Integer>  numberLinkedHashSet = new LinkedHashSet<>();
        numberLinkedHashSet.add(100);
        numberLinkedHashSet.add(400);
        numberLinkedHashSet.add(500);
        numberLinkedHashSet.add(300);
        numberLinkedHashSet.add(200);

        System.out.println("LinkedHashSet --> " + numberLinkedHashSet);
     // In a LinkedHashSet elements are stored in the order of insertion.
        numberLinkedHashSet.add(600);
        System.out.println("LinkedHashSet --> " +numberLinkedHashSet);

        Set<Integer> numberTreeSet = new TreeSet<>();
        numberTreeSet.add(100);
        numberTreeSet.add(400);
        numberTreeSet.add(500);
        numberTreeSet.add(300);
        numberTreeSet.add(200);

        System.out.println("TreeSet --> "+numberTreeSet);
     // In a TreeSet,elements are stored in sorted order.
        numberTreeSet.add(600);
        System.out.println("TreeSet -->" +numberTreeSet);

    }
}
