package strings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SubsetCompaniesTest {

	@Test
	public void testSpec1() {
		SubsetCompanies sc = new SubsetCompanies();
		int [] expected = {0,1,4};
		
		List<List<String>> favouriteCompanies = List.of(
				List.of("leetcode","google","facebook"),
				List.of("google","microsoft"),
				List.of("google","facebook"),
				List.of("google"),
				List.of("amazon") );
		
		assertArrayEquals(expected, sc.peopleIndexes(favouriteCompanies));
	}
	
	@Test
	public void testSpec2() {
		SubsetCompanies sc = new SubsetCompanies();
		int [] expected = {0,1};
		
		List<List<String>> favouriteCompanies = List.of(
				List.of("leetcode","google","facebook"),
				List.of("leetcode","amazon"),
				List.of("facebook","google")
				);
		
		assertArrayEquals(expected, sc.peopleIndexes(favouriteCompanies));
	}
	
	@Test
	public void testSpec3() {
		SubsetCompanies sc = new SubsetCompanies();
		int [] expected = {0,1,2,3};
		
		List<List<String>> favouriteCompanies = List.of(
				List.of("leetcode"),
				List.of("google"),
				List.of("amazon"),
				List.of("facebook")
				);
		
		assertArrayEquals(expected, sc.peopleIndexes(favouriteCompanies));
	}
}
