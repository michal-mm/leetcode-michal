package strings;

public class HappyStrings {
    /**
     * A happy string is a string that:
     * ----
     * consists only of letters of the set ['a', 'b', 'c'].
     * s[i] != s[i + 1] for all values of i from 1 to s.length - 1 (string is 1-indexed).
     * For example, strings "abc", "ac", "b" and "abcbabcbcb"
     * are all happy strings and strings "aa", "baa" and "ababbc"
     * are not happy strings.
     * ---
     * Given two integers n and k, consider a list of all
     * happy strings of length n sorted in lexicographical order.
     * ---
     * Return the kth string of this list or return an empty string
     * if there are less than k happy strings of length n.
     * @param n - happy string length
     * @param k - k-th happy string
     * @return k-th happy string or empty string if k-th doesn't exist
     */
    public String getHappyString(int n, int k) {
        int[] happySeq = new int[n];
        int numOfGeneratedHappyStr = 0;

        for (int i=0; i<Math.pow(3, n); i++) {
            if (isHappy(happySeq)) {
                numOfGeneratedHappyStr++;
                if (numOfGeneratedHappyStr == k) {
                    return generateHappyStr(happySeq);
                }
            }
            addOne(happySeq);
        }

        return "";
    }

    private void addOne(int[] sequence) {
        int idx = sequence.length-1;
        while (idx >= 0) {
            sequence[idx]++;
            if (sequence[idx] <= 2) {
                break;
            } else {
                sequence[idx] = 0;
                idx--;
            }
        }
    }

    private boolean isHappy(int[] sequence) {
        for(int i=0; i<sequence.length-1; i++) {
            if (sequence[i] == sequence[i+1]) {
                return false;
            }
        }

        return true;
    }

    private String generateHappyStr (int[] sequence) {
        StringBuilder strBuild = new StringBuilder();
        for (int j : sequence) {
            if (j == 0) {
                strBuild.append('a');
            } else if (j == 1) {
                strBuild.append('b');
            } else if (j == 2) {
                strBuild.append('c');
            }
        }

        return strBuild.toString();
    }
}
