package CollectionsFrameWork.Lists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ListsInterFace2 {

    public static void main(String[] args) {

        List<String> words = List.of("Apple","Bat","Cat","Ball","Train","RainCoat","LifeBoat");
        List<String> wordsAl = new ArrayList<>(words);

       // ListIterationsDemo(words,wordsAl);

        List values = List.of("A",'A',1,1.0);
        List<Integer> numberValues = List.of(101,102,103,104,105);
       // ListPuzzles(values,numberValues);

        ListSortingDemo();
    }

    private static void ListIterationsDemo(List<String> words, List<String> wordsAl) {

        /**  For non-mutating iterations, an enhanced for
         *   loop is the most convenient
         */

        for (String word : words){
            if (word.endsWith("at"))
                System.out.println(word);
        }




        /** For mutating iterations:
         *  Deletions: An enhanced for  loop is not recommended,
         *  because the iteration itself was affected.
         *  This will give ConcurrentModificationException
         */

         for (String word : wordsAl){
            if (word.endsWith("at"))
                wordsAl.remove(word);
            System.out.println(wordsAl);
         }


        /** In order to avoid this
         * Iterators can be used for such iterations.
         */


               Iterator wordsIterator = wordsAl.iterator();
               while (wordsIterator.hasNext()){
                 if (wordsIterator.next().equals("at")){
                        wordsIterator.remove();
                     System.out.println(wordsAl);
                      }
                  }


    }

    private static void ListPuzzles(List values, List<Integer> numberValues) {
        System.out.println(values.get(1));

        /** A List collection does not store primitives.
         * It only stores object references. When we attempt to store primitive types,such as those of
         * int,char or double they get implicitly converted to their wrapper class types, namely
         * Integer Character and Double respectively. Primitive data type elements get auto-boxed
         */

        boolean words = values.get(0) instanceof String;
        System.out.println(words);

        boolean characters = values.get(1) instanceof Character;
        System.out.println(characters);

        boolean number = values.get(2) instanceof Integer;
        System.out.println(number);

        boolean doubles = values.get(3) instanceof Double;
        System.out.println(doubles);



        System.out.println(numberValues.indexOf(101));

        List<Integer> numberAL = new ArrayList<>(numberValues);
        System.out.println(numberAL.indexOf(101));

        /**  The ArrayList.indexOf() method is not overloaded, there is only one version.SO,when passed an
         *   int argument, it is auto-boxed to an Integer object, and the method gets executed.
         *   However, theArrayList.remove()  method has two overloaded versions:
         *   ArrayList.remove(int index) : attempts to delete an element at the specified index in the ArrayList.
         *   ArrayList.remove(Object o) : attempts to delete the specified element, if it is present in the ArrayList
         */

        //This  will throw exception -->
        // numberAL.remove(101);

        System.out.println(numberAL.remove(Integer.valueOf(101)));
        System.out.println(numberAL);

    }


    private static void ListSortingDemo() {
        List<Integer> numbers =  List.of(123,100,8,19,12);
        List<Integer> numbersAl = new ArrayList<>(numbers);
          Collections.sort(numbersAl);
        System.out.println( "Sorted List ---> " + numbersAl);
    }



}
