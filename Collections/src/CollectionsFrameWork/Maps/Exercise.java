package CollectionsFrameWork.Maps;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

    public static void main(String[] args) {

        String fullName = "Gourav Thakur";
        char[] characters = fullName.toCharArray();
        Map<Character,Integer> letter = new HashMap<>();
        for (char character :characters ){
            Integer count = letter.get(character);
               if (count == null){
                   letter.put(character,1);
               }else {
                   letter.put(character,count + 1);
               }
        }
        System.out.println(letter);

        String str = "I love Java";
        String[] words = str.split(" ");
        Map<String, Integer> frequency = new HashMap<>();
        for(String word:words) {
            Integer number = frequency.get(word);
            if(number == null) {
                frequency.put(word, 1);
            } else {
                frequency.put(word, number + 1);
            }
        }
        System.out.println(frequency);
    }
}