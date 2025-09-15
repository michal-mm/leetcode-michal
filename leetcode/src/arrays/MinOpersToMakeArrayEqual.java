package arrays;

public class MinOpersToMakeArrayEqual {

    /**
     * You have an array arr of length n where arr[i] = (2 * i) + 1
     * for all valid values of i (i.e., 0 <= i < n).
     * ---
     * In one operation, you can select two indices x and y
     * where 0 <= x, y < n and subtract 1 from arr[x] and add 1 to arr[y]
     * (i.e., perform arr[x] -=1 and arr[y] += 1).
     * The goal is to make all the elements of the array equal.
     * It is guaranteed that all the elements of the array
     * can be made equal using some operations.
     * ---
     * Given an integer n, the length of the array,
     * return the minimum number of operations needed
     * to make all the elements of arr equal.
     * @param n - array length
     * @return minimum number of operations needed
     */
    public int minOperations(int n) {
        // the middle item is n/2 -> 2*n/2+1
        // for odd (n%2=1)
        // the middle item doesn't need any actions, we do it for 0&n-1, 1&n-2, etc.
        // [1,3,5] n=3; middle=1->2*(3/2)+1=2*1+1=3
        // middle-arr[0] = 3-(2*0+1) = 2 (moves)
        // iterate from 0 to middle-1 -> result+= middle-arr(current)
        //
        // for even (n%2=0)
        // [1, 3, 5, 7] n=4; middle=2
        // here we have to first make the two middle items equal, so we need 1 extra move
        // [1, 4, 4, 7]; now iterate from 0 to middle-2 -> result += middle-arr(current)+1
        int result = 0;
        int middle = n/2;

        if (n % 2 == 1) {
            for (int i=0; i<=middle-1; i++){
                result += arr(middle)-arr(i);
            }
        } else {
            result += 1;
            for (int i=0; i<=middle-2; i++) {
                result += arr(middle-1) - arr(i) + 1;
            }
        }

        return result;
    }

    private int arr(int x) {
        return 2*x + 1;
    }
}
