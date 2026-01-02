package numbers;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class NumbersAscendingInSentence {

    public boolean areNumbersAscending(String s) {

        List<Integer> numbers = Pattern.compile("\\d+")
                .matcher(s)
                .results()
                .map(MatchResult::group)
                .map(Integer::valueOf)
                .toList();

        return IntStream.range(1, numbers.size())
                .allMatch(i -> numbers.get(i-1) < numbers.get(i));
    }
}
