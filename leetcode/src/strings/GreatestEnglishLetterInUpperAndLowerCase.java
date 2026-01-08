package strings;

public class GreatestEnglishLetterInUpperAndLowerCase {
    
    public String greatestLetter(String s) {
        int[] lowerCase = new int[26];
        int[] upperCase = new int[26];

        int UPPER_CASE = 65;
        int LOWER_CASE = 97;
     
        for (char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) {
                upperCase[c - UPPER_CASE]++;
            } else if (Character.isLowerCase(c)) {
                lowerCase[c - LOWER_CASE]++;
            }
        }

        for (int i=25; i>=0; i--) {
            if (upperCase[i] > 0 && lowerCase[i] > 0) {
                return new StringBuilder().appendCodePoint(i + UPPER_CASE).toString();
            }
        }

        return "";
    }
        
}
