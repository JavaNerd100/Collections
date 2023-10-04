package CollectionsFrameWork.Sets;

import java.util.*;

public class Exercise {

    public static void main(String[] args) {

        List<Character> list = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

        Set<Character> characterHashSet = new HashSet<>(list);
        System.out.println("UniqueCharacter -->" + characterHashSet);

        Set<Character> characterTreeSet = new TreeSet<>(list);
        System.out.println("SortedOrder -->" + characterTreeSet);

        Set<Character> characterLinkedHashSet = new LinkedHashSet<>(list);
        System.out.println("InsertionOrder --> " + characterLinkedHashSet);


    }
}
