package numbers;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;


public class LinkedNumbersTest extends TestCase {
	
	private LinkedNumbers ln;
	
	

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		ln = new LinkedNumbers();
	}



	@Test
	public void test_spec1 () {
		List<Integer> l1 = List.of(2,4,3);
		List<Integer> l2 = List.of(5,6,4);
		List<Integer> expected = List.of(7,0,8);
		
		assertArrayEquals(expected.toArray(), ln.getDigits(l1, l2).toArray());
	}
	
	@Test
	public void test_spec2 () {
		List<Integer> l1 = List.of(0);
		List<Integer> l2 = List.of(0);
		List<Integer> expected = List.of(0);
		
		assertArrayEquals(expected.toArray(), ln.getDigits(l1, l2).toArray());
	}
	
	@Test
	public void test_spec3 () {
		List<Integer> l1 = List.of(9,9,9,9,9,9,9);
		List<Integer> l2 = List.of(9,9,9,9);
		List<Integer> expected = List.of(8,9,9,9,0,0,0,1);
		
		assertArrayEquals(expected.toArray(), ln.getDigits(l1, l2).toArray());
	}
}
