package numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChildrenAndBallTest  {

	@Test
	public void testSpec1 () {
		ChildrenAndBall cab = new ChildrenAndBall();
		assertEquals(1, cab.getChildIdxAfterKseconds(3, 5));
		assertEquals(1, cab.getSimpleChildIdxAfterKseconds(3, 5));
	}

	@Test
	public void testSpec2 () {
		ChildrenAndBall cab = new ChildrenAndBall();
		assertEquals(2, cab.getChildIdxAfterKseconds(5, 6));
		assertEquals(2, cab.getSimpleChildIdxAfterKseconds(5, 6));
	}

	@Test
	public void testSpec3 () {
		ChildrenAndBall cab = new ChildrenAndBall();
		assertEquals(2, cab.getChildIdxAfterKseconds(4, 2));
		assertEquals(2, cab.getSimpleChildIdxAfterKseconds(4, 2));
	}
}
