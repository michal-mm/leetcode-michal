package tuples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TuplesWithSameProduct {


    public int tupleSameProduct (int [] nums) {
        int result = 0 ;

        /* 
         * input example: 2,3,4,6
         * output: 8
         * 
         * 1. calc product of each pair (2,3)->6, (2,4)->8, (3,4)->12, etc.
         * 2. store multiplication pairs in a hashmap:
         *     - key: result of multiplication
         *     - value: set of pairs
         * 3. calculate distinct pairs
         *     - (p1,p2) & (p2, p1) -> 2 * 4
         *     - p1 = (p1.1 | p1.2) -> 2 
         *     - p2 = (p2.1 | p2.2) -> 2
         */

        // Map <Integer, Set<Pair>> mulsAndPairs = new HashMap<Integer, Set<Pair>>();

        // for (int i = 0; i<(nums.length-1); i++) {
        //     for (int j=i+1; j<nums.length; j++) {
        //         Pair p = new Pair(nums[i], nums[j]);
        //         if (mulsAndPairs.containsKey(p.multiply())){
        //             mulsAndPairs.get(p.multiply()).add(p);
        //         } else {
        //             HashSet<Pair> setOfPairs = new HashSet<>();
        //             setOfPairs.add(p);
        //             mulsAndPairs.put(p.multiply(), setOfPairs);
        //         }
        //     }
        // }

        return  IntStream.range(0, nums.length-1)
                        .boxed()
                        .flatMap(i -> IntStream.range(i+1, nums.length)
                            .mapToObj(j -> new Pair(nums[i], nums[j])))
                        .collect(Collectors.groupingBy(Pair::multiply, Collectors.toSet()))
                        .values().stream()
                        .mapToInt(this::getDistinctPairs)
                        .sum();


        // return mulsAndPairs.values().stream()
        //         .mapToInt(this::getDistinctPairs)
        //         .sum();
    }

    private int getDistinctPairs (Set<Pair> pairs) {
        // int result = 0;

        // List <Pair> listOfPairs = pairs.stream().toList();
        // for (int i=0; i<listOfPairs.size()-1; i++) {
        //     for (int j=i+1; j<listOfPairs.size(); j++) {
        //         Pair p1 = listOfPairs.get(i);
        //         Pair p2 = listOfPairs.get(j);
        //         if (p1.equals(p2) == false) {
        //             result += 2*4;
        //         }
        //     }
        // }

        return pairs.stream()
            .flatMap(p1 -> pairs.stream()
                                .filter(p2 -> !p1.equals(p2))
                                .map(p2 -> 4))
            .mapToInt(Integer::intValue)
            .sum();

        // return result;
    }
}
