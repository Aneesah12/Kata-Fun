package intCounter;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class IntCounterTest {

    @Test
    public void canCountIntsInAnArray() throws Exception {
        Map<Integer, Integer> intCount = new HashMap<>();
        intCount.put(3, 3);
        intCount.put(2, 1);
        intCount.put(4, 2);
        intCount.put(5, 1);

        int [] array = new int[]{3, 2, 5, 3, 3, 4, 4};

        assertEquals(intCount, IntCounter.count(array));
    }
}
