package strings;

import java.util.stream.IntStream;

public class StringSwap {

    public boolean areAlmostEqual (String s1, String s2) {
        /*
         * brute force
         * - check if strings arent't the same
         * - for each cahr position check if you can swap two characters
         */

        
        // return s1.equals(s2) || 
        //     IntStream.range(0, s1.length()-1)
        //             .anyMatch(i -> IntStream.range(i+1, s1.length())
        //                         .anyMatch(j -> canBeFlipped(s1, s2, i, j)));
        
        return s1.equals(s2) || IntStream.range(0, s1.length()-1)
            .boxed()
            .flatMap(i-> IntStream.range(i+1, s1.length())
                    .mapToObj(j-> new int[] {i,j}))
            .anyMatch(pair -> canBeFlipped(s1, s2, pair[0], pair[1]));
            
        /*
        if (s1.equals(s2))
            return true;

        for (int i=0; i<s1.length()-1; i++) {
            for (int j=i+1; j<s1.length(); j++) {
                if (canBeFlipped(s1, s2, i, j))
                    return true;
            }
        }

        return false;
        */
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
