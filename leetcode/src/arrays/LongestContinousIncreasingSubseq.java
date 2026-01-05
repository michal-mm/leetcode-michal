package arrays;


public class LongestContinousIncreasingSubseq {
    
    public int findLengthOfLCIS(int[] nums) {

        int result = 1;
        int longestSeq = 0;

        for (int i=1; i<nums.length; i++) {
            if (nums[i-1] < nums[i]) {
                result++;
            } else {
                if (result > longestSeq) {
                    longestSeq = result;
                }
                result = 1;
            }
        }
    
        return result > longestSeq ? result : longestSeq;
    }
}
