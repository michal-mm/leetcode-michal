package strings;

public class ShortestPalindrome {

    public String shortestPalindrome(String s) {

        var result = s;
        StringBuilder left = new StringBuilder();
        int lastIdx = s.length() - 1;
        while (!isPalindrome(result)) {
            left.append(s.charAt(lastIdx));
            lastIdx--;
            result = left + s;
        }

        return result;
    }

    private boolean isPalindrome(String s) {
        return s.contentEquals(new StringBuilder(s).reverse());
    }
}
