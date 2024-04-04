package tools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class palindromeCheckerTest {

palindromeChecker palindromeChecker = new palindromeChecker();
    
    @Test
    public void testReverse() {
        assertEquals("level", palindromeChecker.reverse("level"));
        assertEquals("abe", palindromeChecker.reverse("eba"));
    }
    
    @Test
    public void testIsPalindrome() {
        assertEquals(true, palindromeChecker.isPalindrome("level"));
        assertEquals(false, palindromeChecker.isPalindrome("eba"));
    }

}
