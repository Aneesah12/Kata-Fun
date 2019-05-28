package stringCounter;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void mapShowsCorrectCountOfNumbersInAGivenString() throws Exception {
        Map<String, Integer> numberCounter = new HashMap<>();
        numberCounter.put("one", 2);
        numberCounter.put("two", 2);
        numberCounter.put("three", 1);

        assertEquals(numberCounter, Counter.stringCounter("one, two, three, two, one"));
    }
}
