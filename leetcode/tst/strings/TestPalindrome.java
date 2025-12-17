package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPalindrome {

    @Test
    public void testSpec1 () {
        int number = 121;
        Palindrome p = new Palindrome();
        assertTrue(p.isPalindrome(number));
        assertTrue(p.isPalindromeDecl(number));
        assertTrue(p.isPalindromeDeclWoStr(number));
    }

    @Test
     public void testSpec2 () {
        int number = -121;
        Palindrome p = new Palindrome();
        assertFalse(p.isPalindrome(number));
        assertFalse(p.isPalindromeDecl(number));
        assertFalse(p.isPalindromeDeclWoStr(number));
    }

    @Test
     public void testSpec3 () {
        int number = 10;
        Palindrome p = new Palindrome();
        assertFalse(p.isPalindrome(number));
        assertFalse(p.isPalindromeDecl(number));
        assertFalse(p.isPalindromeDeclWoStr(number));
    }

    @Test
     public void testSpec4 () {
        int number = 123321;
        Palindrome p = new Palindrome();
        assertTrue(p.isPalindrome(number));
        assertTrue(p.isPalindromeDecl(number));
        assertTrue(p.isPalindromeDeclWoStr(number));
    }

    @Test
    public void testSpec5 () {
        int number = 5;
        Palindrome p = new Palindrome();
        assertTrue(p.isPalindrome(number));
        assertTrue(p.isPalindromeDecl(number));
        assertTrue(p.isPalindromeDeclWoStr(number));
    }
}
