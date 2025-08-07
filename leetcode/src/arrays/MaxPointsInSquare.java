package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxPointsInSquare {

	/* 
	 * point[i] -> point coords: x=point[i][0], y=points[i][1]
	 * s[i] -> tag for i-th pos 
	 * 
	 * A valid square is a square centered at the origin (0, 0), 
	 * has edges parallel to the axes, and does not contain 
	 * two points with the same tag.
	 * 
	 * Return the maximum number of points contained in a valid square.
	 * 
	 * For each point max(|x|,|y|) defines min square 
	 * to which the point will fall into.
	 *    -> let squares to store set of points for given size
	 *    		squares[i] -> set<char>  ==> stores set of chars possible 
	 *    				for given square size
	 *  
	 */
	public int maxPointsInsideSquare(int [][] points, String s) {
		
	    Map<Integer, Set<Character>> squareSizeToChars = new HashMap<>();
	    int maxValidSize = Integer.MAX_VALUE;
	    
	    for (int i = 0; i < points.length; i++) {
	        int x = points[i][0];
	        int y = points[i][1];
	        char c = s.charAt(i);
	        
	        int squareSize = Math.max(Math.abs(x), Math.abs(y));
	        
	        // Initialize set if needed
	        squareSizeToChars.putIfAbsent(squareSize, new HashSet<>());
	        
	        Set<Character> charsAtSize = squareSizeToChars.get(squareSize);
	        
	        // Check for duplicate character at this size or any smaller size
	        if (charsAtSize.contains(c) || 
	            squareSizeToChars.entrySet().stream()
	                .filter(entry -> entry.getKey() < squareSize)
	                .anyMatch(entry -> entry.getValue().contains(c))) {
	            
	            maxValidSize = Math.min(maxValidSize, squareSize);
	        } else {
	            charsAtSize.add(c);
	        }
	    }
	    
	    final int finalMaxValidSize = maxValidSize;
	    
	    // Find the largest valid square size and count its points
	    return squareSizeToChars.entrySet().stream()
	        .filter(entry -> entry.getKey() < finalMaxValidSize)
	        .mapToInt(entry -> entry.getValue().size())
	        .sum();
	}
}
