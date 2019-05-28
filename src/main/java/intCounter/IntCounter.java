package intCounter;

import java.util.HashMap;
import java.util.Map;

public class IntCounter {
    public static Map<Integer, Integer> count(int[] array) {
        Map<Integer, Integer> intMap = new HashMap<>();

        for(int arr : array) {
            if(intMap.containsKey(arr)) {
                int count = intMap.get(arr);
                intMap.put(arr, count + 1);
            } else {
                intMap.put(arr, 1);
            }
        }
        return intMap;
    }
}
