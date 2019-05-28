package stringCounter;

import java.util.HashMap;
import java.util.Map;

public class Counter {
    public static Map<String, Integer> stringCounter(String numberString) {
        String [] words = numberString.split(", ");
        Map<String, Integer> mapCounter = new HashMap<>();

        for(String word: words) {
            if(mapCounter.containsKey(word)) {
                int count = mapCounter.get(word);
                mapCounter.put(word, count + 1);
            } else {
                mapCounter.put(word, 1);
            }
        }
        return mapCounter;
    }
}
