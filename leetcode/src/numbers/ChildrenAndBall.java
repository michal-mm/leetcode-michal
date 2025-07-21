package numbers;

public class ChildrenAndBall {

	public int getChildIdxAfterKseconds (int numOfKids, int k) {
		
		/* 
		 * each move costs 1 second -> k-seconds means k-moves
		 * numOfKids / k = how many full row iterations are done
		 *    num_iters %2 == 0 -> till the end and back
		 *    else -> till the end
		 *    
		 *    example: (3,5) -> 1
		 *             (5,6) -> 2
		 *             (4,2) -> 2
		 *             
		 *    after numOfKids seconds the index will be on (numOfKids-1)-1
		 *    after (numOfKids-1) seconds the last kid will have the ball
		 *    after 2*(numOfKids-1) seconds the fist kid will have the ball
		 *    after 3*(numOfKids-1) the last will have ball again...
		 */
		
		
		int elem = 0;
		int factor = 1;
		for(int i=1; i<=k; i++) {
			elem += factor;
			if (elem%(numOfKids-1) == 0) {
				// last or first has the ball
				// reverse order
				factor *= -1;
			}
		}
		
		return elem;
	}
	
	public int getSimpleChildIdxAfterKseconds (int numOfKids, int k) {
		 if (numOfKids <= 1) return 0;
		    
		    // The pattern repeats every 2*(numOfKids-1) moves
		    int cycleLength = 2 * (numOfKids - 1);
		    int position = k % cycleLength;
		    
		    // First half of cycle: moving forward (0 -> numOfKids-1)
		    // Second half: moving backward (numOfKids-1 -> 0)
		    if (position < numOfKids) {
		        return position;
		    } else {
		        return 2 * (numOfKids - 1) - position;
		    }
	}
}
