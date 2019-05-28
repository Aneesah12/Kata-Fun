package palindrome;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void wordIsAPalindrome() {
        assertTrue(Palindrome.stringIsAPalindrome("anNa"));
    }

    @Test
    public void wordIsNotAPalindrome() {
        assertFalse(Palindrome.stringIsAPalindrome("difficult"));
    }

    @Test
    public void wordIsAPalindromeWithWhiteSpace() {
        assertTrue(Palindrome.stringIsAPalindrome(" abba"));
    }

    @Test
    public void phraseIsAPalindrome() throws Exception {
        assertTrue(Palindrome.stringIsAPalindrome("nurses run"));
    }

    @Test
    public void doesNotAcceptNullValueAsAPalindrome() throws Exception {
        assertFalse(Palindrome.stringIsAPalindrome(null));
    }

    @Test
    public void doesNotAcceptEmptyStringAsAPalindrome() throws Exception {
        assertFalse(Palindrome.stringIsAPalindrome(""));
    }
}
