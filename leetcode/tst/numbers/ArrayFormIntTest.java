package numbers;

import static org.junit.Assert.assertArrayEquals;

import junit.framework.TestCase;

public class ArrayFormIntTest extends TestCase{

	public void testSpec1 () {
		int [] num = {1,2,0,0};
		int k = 34;
		int[] expected = {1,2,3,4};
		
		ArrayFormInt afi = new ArrayFormInt();
		assertArrayEquals(expected, afi.addToArrayForm(num, k));
	}
	
	public void testSpec2 () {
		int [] num = {2,7,4};
		int k = 181;
		int[] expected = {4,5,5};
		
		ArrayFormInt afi = new ArrayFormInt();
		assertArrayEquals(expected, afi.addToArrayForm(num, k));
	}
	
	public void testSpec3 () {
		int [] num = {2,1,5};
		int k = 806;
		int[] expected = {1,0,2,1};
		
		ArrayFormInt afi = new ArrayFormInt();
		assertArrayEquals(expected, afi.addToArrayForm(num, k));
	}
}
