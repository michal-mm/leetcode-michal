package arrays;

public class TeemoAttacking {

	/**
	 * Our hero Teemo is attacking an enemy Ashe with poison attacks! W
	 * hen Teemo attacks Ashe, Ashe gets poisoned for a exactly duration seconds. 
	 * More formally, an attack at second t will mean Ashe is poisoned 
	 * during the inclusive time interval [t, t + duration - 1]. 
	 * If Teemo attacks again before the poison effect ends, 
	 * the timer for it is reset, and the poison effect will end 
	 * duration seconds after the new attack.
	 * 
	 * You are given a non-decreasing integer array timeSeries, 
	 * where timeSeries[i] denotes that Teemo attacks Ashe at second timeSeries[i], 
	 * and an integer duration
	 * 
	 * Return the total number of seconds that Ashe is poisoned.
	 * 
	 * 
	 * @param timeSeries
	 * @param duration
	 * @return
	 */
    public int findPoisonedDuration(int[] timeSeries, int duration) {
    	int timer = 0;
    	int lastUntilSecond = 0;
    	
    	for (int second: timeSeries) {
    		timer += duration;
    		// what if we are in second 3, but lastUntilSecond=5
    		if (second <= lastUntilSecond) {
    			timer -= (lastUntilSecond-second+1);
    		}
    		// at the end, update the lastUntilSecond
    		lastUntilSecond = second+duration-1;
    	}
    	
        return timer;
    }
}
