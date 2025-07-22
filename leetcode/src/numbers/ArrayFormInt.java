package numbers;

import java.util.ArrayList;
import java.util.List;

public class ArrayFormInt {

	public int[] addToArrayForm(int[] num, int k) {
		
		/* 
		 * num in reverse order and iterate
		 *    res += rev(num([idx])*10^idx
		 *    res += k;
		 *    
		 * now reverse the result by %10 and /10:
		 * add tmp_arr res%10; res/10
		 * reverse tmp_arr and return
		 */
		
		int sum = 0;
		int pow10 = 1;
		for (int i=0; i<num.length; i++) {
			sum += num[num.length-1-i] * pow10;
			pow10 *= 10;
		}
		sum += k;
		
		List <Integer> tmpArr = new ArrayList<Integer>();
		while (sum > 0) {
			tmpArr.add(sum%10);
			sum = sum/10;
		}
		    
		return tmpArr.reversed().stream().mapToInt(i->i).toArray();
    }
}
