package anagram1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {

    @Test
    void testAnagrams() {
        // Test anagrams
        assertTrue(Anagram.areAnagrams("listen", "silent"));
        assertTrue(Anagram.areAnagrams("hello", "llohe"));
        assertTrue(Anagram.areAnagrams("debit card", "bad credit"));

        // Test non-anagrams
        assertFalse(Anagram.areAnagrams("hello", "world"));
        assertFalse(Anagram.areAnagrams("apple", "banana"));
        assertFalse(Anagram.areAnagrams("hello", "hola"));
    }
}

