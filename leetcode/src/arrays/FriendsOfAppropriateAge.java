package arrays;

import java.util.Arrays;

public class FriendsOfAppropriateAge {
    /**
     * A Person x will not send a friend request to a person y (x != y) 
     * if any of the following conditions is true:
        age[y] <= 0.5 * age[x] + 7
        age[y] > age[x]
        age[y] > 100 && age[x] < 100
        Otherwise, x will send a friend request to y.
     * @param ages ...
     * @return num of relations
     */
    public int numFriendRequests(int[] ages) {
       var result = 0;

        Arrays.sort(ages);
     
        for (int i=ages.length-1; i>=0; i--) {
            for (int j=ages.length-1; j>=0; j--) {
                if (ages[i]<ages[j]) continue;
                if (!xWillNotSendRequestToY(ages, i, j)) {
                    result++;
                }
            }
        }

        return result;
    }

    private boolean xWillNotSendRequestToY(int[] age, int x, int y) {
        return x == y || 
            age[y] <= 0.5 * age[x] + 7 || /* ag[x]>age[y]-7 && age[x]>=age[y] */
            age[y] > age[x] ||
            (age[y] > 100 && age[x] < 100);
    }
}
