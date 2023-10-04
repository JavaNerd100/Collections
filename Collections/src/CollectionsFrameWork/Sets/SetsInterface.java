package CollectionsFrameWork.Sets;

import java.util.HashSet;
import java.util.Set;

public class SetsInterface {

    public static void main(String[] args) {

        Set<String> words = Set.of("apple","cat","bat");
     // Set collection doesn't give any importance to element order
        System.out.println(words);

    /* The collection returned by Set.of() is immutable, hence does not support the add() method.
     * This will throw an exception
     *   words.add("car");
     *  System.out.println(words);
     */

     /* In order to use add() method over Set Interface we have to use Hashset
      * which support this method in order to test uniqueness property of a set
      */
        HashSet<String> wordsHastSet = new HashSet<>(words);
        wordsHastSet.add("car");
        System.out.println(wordsHastSet);

     // If we try to add duplicate element in the set the add() method will return false.
     // indicating that inserting a duplicate element i.e("car") entry has failed
        Boolean addResult = wordsHastSet.add("car");
        System.out.println(addResult);

     /** Note that when the hashSet was constructed using the set ,the order of the elements got permuted/changed.
      * Also originally, when we created the set from the Set.of() method, the order printed was different from
      * the order of initialization. This confirms the fact that a Set collection does not give any importance to
      * element order,and therefore, does not support positional access. Hence, the compiler error on call to
      * hashSet.add(int,String)
      * @wordsHastSet.add(2,"Train");
      */



    }
}
