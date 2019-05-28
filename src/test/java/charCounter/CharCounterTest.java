//hello
package charCounter;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CharCounterTest {

    @Test
    public void canCountNumberOfUniqueCharsInAString() throws Exception {
        Map<Character, Integer> charMap = new HashMap<>();
        charMap.put('a', 1);
        charMap.put('e', 3);
        charMap.put('l', 3);
        charMap.put('p', 1);
        charMap.put('h', 2);
        charMap.put('n', 1);
        charMap.put('t', 1);
        charMap.put('o', 1);

        assertEquals(charMap, CharCounter.count("elephant, hello"));

    }
}


