package CollectionsFrameWork.Queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/** Queue interface : extends the Collection interface .
 *  Elements are arranged in order of processing,
 *  such as in a To-Do List.
 */
public class QueueInterface {

    public static void main(String[] args) {

/**  The PriorityQueue collection is a built-in Java class ,that implements the Queue interface .
 * Elements are stored in a sorted natural order, by default.
 * We can also specify a different custom order, called the order of priority(customized by the programmer).
 */

        Queue<Integer> numberQueue = new PriorityQueue<>();

        numberQueue.addAll(List.of(100,20,10,11,200));
        System.out.println(numberQueue);

   //  Queue.poll() de-queue's the element at the beginning of the natural order
        System.out.println(numberQueue.poll());
        System.out.println(numberQueue);

   //   Queue.offer() en -queue's the element in the last position
        numberQueue.offer(299);
        System.out.println(numberQueue);

   //  The PriorityQueue queue stores the strings in ascending alphabetic order by default
        Queue<String> wordsQueue = new PriorityQueue<>();
       wordsQueue.addAll(List.of("Mango","Zebra","Apple","Cat"));
        System.out.println(wordsQueue);

        wordsQueue.poll();
        wordsQueue.poll();
        wordsQueue.poll();
        wordsQueue.poll();
        System.out.println(wordsQueue.poll());

        System.out.println(wordsQueue);


    }
}
