package arrays;

public class IsArraySortedAndRotated {

    public boolean check(int[] nums) {
        int breakPointPos = -1;

        for (int i=1; i<nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                if (breakPointPos != -1) {
                    // we would need more than one rotation -> impossible
                    return false;
                } else {
                    breakPointPos = i;
                }
            }
        }

        if (breakPointPos != -1) {
            return nums[nums.length - 1] <= nums[0];
        } else {
            return true;
        }
    }
}
