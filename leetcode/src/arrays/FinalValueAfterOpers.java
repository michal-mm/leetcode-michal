package arrays;

public class FinalValueAfterOpers {
    public int finalValueAfterOperations(String[] operations) {
        // this one seems to be the fasetsts in leetcode tests
        int result = 0;
        for (String str : operations) {
            result += str.charAt(1)=='+' ? 1 : -1;
        }
        return result;


//        return Arrays.stream(operations)
//                .map(str -> str.charAt(1) == '+' ? 1 : -1)
//                .reduce(0, Integer::sum);

//        return Arrays.stream(operations)
//                .map( str -> {
//                    if (str.charAt(1) == '+') return 1;
//                    else return -1;
//                })
//                .mapToInt(i -> i)
//                .sum();
    }
}
