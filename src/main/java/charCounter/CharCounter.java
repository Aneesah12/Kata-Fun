package charCounter;

import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    public static void main(String[] args) {
        Float d = 10.3f;
        int x = 10;
        int y = 23;
        System.out.println(x + y + " ");
        System.out.println(" " + x + y + " ");
        System.out.println(x + " " + y);



    }


    public static Map<Character, Integer> count(String word) {
        word = word.replace(",", "");
        word = word.replace(" ", "");

        char[] wordArray = word.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char wa: wordArray) {
            if(charMap.containsKey(wa)) {
                int count = charMap.get(wa);
                charMap.put(wa, count + 1);
            } else {
                charMap.put(wa, 1);
            }
        }

        return charMap;
    }
}
