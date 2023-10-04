package CollectionsFrameWork.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsInterFace1 {

    public static void main(String[] args){

        //This list is created with "static of method" are immutable
        List<String> wordsList = List.of("Cake","Cat","Bat","Pillow");

        //List methods
        //1) size() it returns the number of elements present in the list
        System.out.println(wordsList.size());

        //2) isEmpty() it checks that list is empty or not
        // it returns boolean value
        System.out.println(wordsList.isEmpty());

        //3) get() it returns the particular element of that index
        System.out.println(wordsList.get(0));

        //4) contains() it checks that particular element are present inside the list or not
        // it returns boolean values
        System.out.println(wordsList.contains("Cake"));

        //5) indexOf() it returns the index of particular element
        System.out.println(wordsList.indexOf("Cat"));

        //This will throw error
        // wordsList.add("elephant");

        /** The way to create mutable lists is to
         *instantiate built-in collection
         * classes that implement the list interface
         * ArrayList , LinkedList ,Vectors
         */

        /** List Implementation
         *  ArrayList
         *  LinkedList
         *  Vector
         */

        //1) ArrayList
        List<String> wordsArrayList = new ArrayList<>(wordsList);
         ListDemo1(wordsArrayList);

        /* 2)LinkedList
         *  List<String> wordsLinkedList = new LinkedList<>(wordsList);
         * System.out.println("LinkedList ->" + wordsLinkedList);
         *
         *
         *  3)Vectors
         * List<String> wordsVectors = new Vector<>(wordsList);
         * System.out.println("Vectors -> " +  wordsVectors);
        */

    }
    private static void ListDemo1(List<String> wordsArrayList) {

        List<String> newList = List.of("Dog","Crocodile");

        //add() it adds  required element in the list
        //it returns boolean value
        System.out.println(wordsArrayList.add("Elephant"));
        System.out.println(wordsArrayList.add("House"));

        wordsArrayList.add(2,"Train");
        System.out.println(wordsArrayList);

        //addAll() it adds all element int the list
        //it also returns boolean value
        wordsArrayList.addAll(newList);
        System.out.println(wordsArrayList);

        System.out.println("ArrayList  ->"  + wordsArrayList);

        //modification and deletions methods -->

        //1) set() it updates the required element in the lists
        System.out.println(wordsArrayList.set(6,"Mobile"));
        System.out.println("updated ArrayLists ->" + wordsArrayList);

        //2)remove() it removes the required elements in the lists
        System.out.println(wordsArrayList.remove(2));
        System.out.println(wordsArrayList.remove("Mobile"));
        System.out.println("new ArrayLists -> " + wordsArrayList);

        //Iterating the list -->

        //1) using normal for loop
        System.out.println("Required output using normal for loop -->");
        for(int i = 0 ; i < wordsArrayList.size() ; i++){
            System.out.println( wordsArrayList.get(i));
        }

        //2) using enhanced for loop
        System.out.println("Required output using enhanced for loop -->");
        for(String words : wordsArrayList ){
            System.out.println (words);
        }

        //3) using Iterators
        Iterator wordsIterator = wordsArrayList.iterator();
        System.out.println("Required output using Iterators -->");
        while(wordsIterator.hasNext()){
            System.out.println(wordsIterator.next());
        }
    }

}
