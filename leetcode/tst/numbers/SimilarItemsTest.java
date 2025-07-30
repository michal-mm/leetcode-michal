package numbers;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import junit.framework.TestCase;

public class SimilarItemsTest extends TestCase {

	public void testSpec1 () {
		int [][] items1 = {{1,1},{4,5},{3,8}};
		int [][] items2 = {{3,1},{1,5}};
		
		List <List<Integer>> expected = List.of(List.of(1,6), List.of(3,9), List.of(4,5));
		
		SimilarItems si = new SimilarItems();
		List<List<Integer>> result =  si.mergeSimilarItems(items1, items2);
		
		
		for (int i=0; i<result.size(); i++) {
			assertArrayEquals(expected.get(i).toArray(), result.get(i).toArray());
		}
	}
}
