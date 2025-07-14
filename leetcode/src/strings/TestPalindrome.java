package strings;

import junit.framework.TestCase;

public class TestPalindrome extends TestCase {

    public void testSpec1 () {
        int number = 121;
        Palindrome p = new Palindrome();
        assertEquals(true, p.isPalindrome(number));
        assertEquals(true, p.isPalindromeDecl(number));
        assertEquals(true, p.isPalindromeDeclWoStr(number));
    }

     public void testSpec2 () {
        int number = -121;
        Palindrome p = new Palindrome();
        assertEquals(false, p.isPalindrome(number));
        assertEquals(false, p.isPalindromeDecl(number));
        assertEquals(false, p.isPalindromeDeclWoStr(number));
    }

     public void testSpec3 () {
        int number = 10;
        Palindrome p = new Palindrome();
        assertEquals(false, p.isPalindrome(number));
        assertEquals(false, p.isPalindromeDecl(number));
        assertEquals(false, p.isPalindromeDeclWoStr(number));
    }

     public void testSpec4 () {
        int number = 123321;
        Palindrome p = new Palindrome();
        assertEquals(true, p.isPalindrome(number));
        assertEquals(true, p.isPalindromeDecl(number));
        assertEquals(true, p.isPalindromeDeclWoStr(number));
    }

    public void testSpec5 () {
        int number = 5;
        Palindrome p = new Palindrome();
        assertEquals(true, p.isPalindrome(number));
        assertEquals(true, p.isPalindromeDecl(number));
        assertEquals(true, p.isPalindromeDeclWoStr(number));
    }
}
