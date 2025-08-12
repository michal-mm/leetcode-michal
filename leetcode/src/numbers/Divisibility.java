package numbers;

public class Divisibility {

	/**
	 * You are given a positive integer n. 
	 * Determine whether n is divisible by the sum of the following two values
	 * 
	 * The digit sum of n (the sum of its digits).
	 * 
	 * The digit product of n (the product of its digits)
	 * 
	 * Return true if n is divisible by this sum; otherwise, return false.
	 * 
	 * example:
	 * Input: n = 99
	 * Output: true
	 * 
	 * 
	 * 
	 * @param n
	 * @return
	 */
    public boolean checkDivisibility(int n) {
    	
    	int digitSum = 0;
    	int product = 1;
    	
    	int tmp = n;
    	
    	while (tmp>0) {
    		digitSum += tmp%10;
    		product *= tmp%10;
    		tmp = tmp/10;
    	}
    	
    	int result = digitSum + product;
    	
    	if (result == 0) { 
    		return false;
    	} else if (n%result == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    
  
}
