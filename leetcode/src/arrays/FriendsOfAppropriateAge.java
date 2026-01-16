package arrays;

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
     
        for (int i=0; i<ages.length; i++) {
            for (int j=0; j<ages.length; j++) {
                if (!xWillNotSendRequestToY(ages, i, j)) {
                    result++;
                }
            }
        }

        return result;
    }

    private boolean xWillNotSendRequestToY(int[] age, int x, int y) {
        return x == y || 
            age[y] <= 0.5 * age[x] + 7 ||
            age[y] > age[x] ||
            (age[y] > 100 && age[x] < 100);
    }
}
