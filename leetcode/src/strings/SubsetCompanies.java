package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubsetCompanies {

	public int [] peopleIndexes (List<List<String>> favoriteCompanies) {
		
		/* 
		 * for each list of fav companies build a string that is sorted string 
		 * (companies sorted in alphabetical order)
		 * for each such sorted String check against all others if it is a substring
		 * 	not a substring => person idx to be returned
		 * 
		 * complexity O(n^2), where n is num of people
		 * 
		 * 
		 * 
		 */
		
		// build mapping of companies 
		Map<String,Integer> company2Idx = new HashMap<String, Integer>();
		List <Integer> results = new ArrayList<Integer>();
		int index = 0;
		for (List<String> favComp4user: favoriteCompanies) {
			for (String company: favComp4user) {
				if (!company2Idx.containsKey(company)) {
					company2Idx.put(company, index);
					results.add(Integer.valueOf(index));
					index += 1;
				}
			}
		}
		
		// for each user build their boolean mapping -> true means user has the company
		// on their list
		boolean [][] userAndCompanies = new boolean [favoriteCompanies.size()][company2Idx.size()];
		for (int i=0; i<favoriteCompanies.size(); i++) {
			for (String company: favoriteCompanies.get(i)) {
				userAndCompanies[i][company2Idx.get(company)] = true;
			}
		}
		
		
		// iterate each user and check against others
		for (int i=0; i<favoriteCompanies.size(); i++) {
			for (int j=0; j<favoriteCompanies.size(); j++) {
				if (i==j) continue;
				
				// if j-th user has less elems, don't compare
				if (favoriteCompanies.get(i).size() > favoriteCompanies.get(j).size()) continue;
				
				// compare positions from i-th (all i-th has to be true in j-th)
				boolean allIn = false;
				for (String company: favoriteCompanies.get(i)) {
					 if (userAndCompanies[j][company2Idx.get(company)]) {
						 allIn = true;
					 } else {
						 // elem not found, break, can't be subset
						 allIn = false;
						 break;
					 }
				}
				if (allIn) {
					// i-th is subset of j-th; stop searching further j-ths
					results.remove(Integer.valueOf(i));
					break;
				}
			}
		}
		
		
		return results.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
}
