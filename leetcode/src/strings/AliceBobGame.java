package strings;

public class AliceBobGame {

	public boolean sumGame (String num) {
		
		/* 
		 * '5023' -> false
		 * '25??' -> true
		 * '?3295???' -> false
		 * 
		 * assumptions:
		 * num.lenght %2 == 0
		 * 
		 * TRUE: sum(0-num.lenght/2) == sum(num.lenght/2-num.lenght)
		 * 
		 * Alice starts!
		 * WHILE (there are '?' in nums)
		 *    CHOOSE one nums[idx]='?' -> 0-9
		 *    FLIP player
		 *    
		 * 
		 */
		
		int aliceScore = 0;
		int bobScore = 0;
		char[] nums = num.toCharArray();
		for (int i=0; i<nums.length/2; i++) {
			if (nums[i] != '?') {
				aliceScore += Integer.parseInt(String.valueOf(nums[i]));
			}
		}
		for (int i=nums.length/2; i<nums.length; i++) {
			if (nums[i] != '?') {
				bobScore += Integer.parseInt(String.valueOf(nums[i]));
			}
		}
		
		System.out.println("alice score: " + aliceScore + "\nbob score: " + bobScore + "\n------");
		
		char[] c = num.toCharArray();
        int d=0, q=0;
        for(int i=0; i<c.length/2; i++){
            if(c[i]=='?')q++;
            else d-=c[i]-'0';
        }
        for(int i=c.length/2; i<c.length; i++){
            if(c[i]=='?'){d+=9; q++;}
            else d+=c[i]-'0';
        }
        if(q%2==1)return true;
        if(q==0)return d!=0;
        return d!=(q/2)*9;
		
		
		
		//return true;
	}
}
