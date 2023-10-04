package CollectionsFrameWork.Queue;


import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String left, String right) {
        return Integer.compare(left.length(),right.length());
    }
}

public class CustomPriorityQueue {

/** A custom priority order on the elements in a PriorityQueue can be
 * specified by passing an implementation ofComparator<? super T> interface
 * to the PriorityQueue<T> constructor.
 */

    public static void main(String[] args) {

        Queue<String> words = new PriorityQueue<>(new StringLengthComparator());
        words.addAll(List.of("Zebra","Monkey","Cat","Apple"));
        System.out.println(words);
        System.out.println(words.poll());
        System.out.println(words.poll());
        System.out.println(words.poll());
        System.out.println(words.poll());


    }
}
