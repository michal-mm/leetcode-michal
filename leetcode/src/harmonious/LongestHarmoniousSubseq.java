package harmonious;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestHarmoniousSubseq {

    public int findDeclarativeLHS (int [] numbers) {
        int result = 0;

        Map<Integer, Integer> keysAndValues = Arrays.stream(numbers)
                            .boxed()
                            .collect(Collectors.groupingBy(Function.identity(), 
                                    Collectors.collectingAndThen(Collectors.counting(), Math::toIntExact)));

        List <Integer> keySorted = (List <Integer>) keysAndValues.keySet().stream()
                            .sorted()
                            .collect(Collectors.toList());
        
        result = IntStream.range(1, keySorted.size())
            .filter(i -> keySorted.get(i) - keySorted.get(i-1) == 1)
            .map(i -> keysAndValues.get(keySorted.get(i)) + keysAndValues.get(keySorted.get(i-1)))
            .max()
            .orElse(0);


        return result;
    }

    public int findLHS (int [] numbers) {
        // todo
        // build map number->num_of_occurences
        // iterate through sorted keys
        //    - if (key - before(key)) == 1 -> result = map(key) + map(before(key))

        int result = 0;

        Map <Integer, Integer> numsAndOccurences = new HashMap<>();
        for (int i : numbers) {
            if (numsAndOccurences.containsKey(i)) {
                numsAndOccurences.replace(i, numsAndOccurences.get(i)+1);
            } else {
                numsAndOccurences.put(i, 1);
            }
        }

        int prevKey = 0;
        boolean firstKey = true;
        for (int key : numsAndOccurences.keySet().stream().sorted().collect(Collectors.toList())) {
            
            if(firstKey == false) {
                if ((key - prevKey) == 1 && 
                    (numsAndOccurences.get(key) + numsAndOccurences.get(prevKey)) > result) {
                        result = numsAndOccurences.get(key) + numsAndOccurences.get(prevKey);
                }
            } 
            prevKey = key;
            firstKey = false;
        }

        return result;
    }

    public static void main(String[] args) {
        // todo
    }
}
