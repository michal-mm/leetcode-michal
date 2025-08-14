package numbers;

import java.util.stream.IntStream;

public class PerfectNumber {

	public boolean checkPerfectNumber(int num) {
		
		int sumOfDivisors = IntStream.range(1, num)
			.filter(i -> num%i==0)
			.sum();
			
		return num == sumOfDivisors ? true : false;
	}
}
