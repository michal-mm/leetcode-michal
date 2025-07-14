package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {

    /* 
     * Constraints:
     * -231 <= x <= 231 - 1
     * 
     * - if is below zero hten is not palindrom as a string (if x < 0 -> false)
     * - to char array
     * - iterate first&last, first+1&last-1, etc. (until int(length/2))
     */
    public boolean isPalindrome (int number) {

        if (number < 0) return false;

        char numChars [] = Integer.toString(number).toCharArray();
        for (int i=0; i<(numChars.length/2); i++) {
            if (numChars[i] != numChars[numChars.length-1-i]) 
                return false;
        }

        return true;
    }

     public boolean isPalindromeDecl (int number) {

        //if (number < 0) return false;

        char numChars [] = Integer.toString(number).toCharArray();
        
        return IntStream.range(0, numChars.length)
            .boxed()
            .allMatch(i -> numChars[i] == numChars[numChars.length-1-i]);
    }

    public boolean isPalindromeDeclWoStr (int number) {

        if (number < 0) return false;
        List <Integer> listOfDigits = new ArrayList<>();
        int tmpNum = number;
        while (tmpNum > 0) {
            listOfDigits.add(tmpNum%10);
            tmpNum = tmpNum/10;
        }
        
        return IntStream.range(0, listOfDigits.size())
            .boxed()
            .allMatch(i -> listOfDigits.get(i) == listOfDigits.get(listOfDigits.size()-1-i));
    }
}
