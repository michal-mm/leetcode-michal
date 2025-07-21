package numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LengthOfLIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 10, 2, 1, 20};
        System.out.println("Length of LIS is " + lengthOfLIS(arr));
	}

	
	static int lengthOfLIS(int[] arr) {
        // Binary search approach
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();

        // Initialize the answer list with the
        // first element of arr
        ans.add(arr[0]);

        for (int i = 1; i < n; i++) {
        	System.out.println("(interim: " + ans);
            if (arr[i] > ans.get(ans.size() - 1)) {
                // If the current number is greater
                // than the last element of the answer
                // list, it means we have found a
                // longer increasing subsequence.
                // Hence, we append the current number
                // to the answer list.
                ans.add(arr[i]);
            } else {
                // If the current number is not
                // greater than the last element of
                // the answer list, we perform
                // a binary search to find the smallest
                // element in the answer list that
                // is greater than or equal to the
                // current number.

                // The binarySearch method returns
                // the index of the first element that is not less than
                // the current number.
                int low = Collections.binarySearch(ans, arr[i]);

                // We update the element at the
                // found position with the current number.
                // By doing this, we are maintaining
                // a sorted order in the answer list.
                if (low < 0) {
                    low = -(low + 1);
                }
                ans.set(low, arr[i]);
            }
        }

        // The size of the answer list
        // represents the length of the
        // longest increasing subsequence.
        
        System.out.println("List: " + ans);
        
        return ans.size();
    }
}
