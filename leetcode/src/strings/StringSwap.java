package strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringSwap {

    public boolean areAlmostEqual (String s1, String s2) {
        /*
         * brute force
         * - check if strings arent't the same
         * - for each cahr position check if you can swap two characters
         */
            

        if (s1.equals(s2))
            return true;

        for (int i=0; i<s1.length()-1; i++) {
            for (int j=i+1; j<s1.length(); j++) {
                if (canBeFlipped(s1, s2, i, j))
                    return true;
            }
        }

        return false;
    }

    private boolean canBeFlipped (String s1, String s2, int idx1, int idx2) {
        char [] s1charArray = s1.toCharArray();
        char tmp = s1charArray[idx2];
        s1charArray[idx2] = s1charArray[idx1];
        s1charArray[idx1] = tmp;

        String s1Flipped = new String(s1charArray);
        return s1Flipped.equals(s2);
    }

}
