package numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SimilarItems {
	
	/* 
	 * iterate over two arrays
	 * for each row:
	 *   values.put(val[i], values.get(val[i])+weight[i]
	 * transfer the values hashmap into List<List<>>
	 */
	
	public List<List<Integer>> mergeSimilarItems(int [][] items1, int [][] items2) {
		Map<Integer, Integer> ret = new HashMap<Integer, Integer>();
		
		for (int i=0; i<items1.length; i++) {
			ret.put(items1[i][0], 
					ret.getOrDefault(items1[i][0], 0) + items1[i][1]);
		}
		
		for (int i=0; i<items2.length; i++) {
			ret.put(items2[i][0], 
					ret.getOrDefault(items2[i][0], 0)+items2[i][1]);
		}
		
		List <List<Integer>> result = new ArrayList<List<Integer>>();
		
		for (int item: ret.keySet().stream().sorted().collect(Collectors.toList()))  {
			result.add(List.of(item, ret.get(item)));
		}
		
		return result;
	}

}
