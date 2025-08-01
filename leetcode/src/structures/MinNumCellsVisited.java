package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class MinNumCellsVisited {

	/**
	 * Return the minimum number of cells you need to visit 
	 * to reach the bottom-right cell (m - 1, n - 1). 
	 * If there is no valid path, return -1.
	 * 
	 * @param grid
	 * @return
	 */
	
	public int minimumVisitedCels (int [][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		
		int [][] dist = new int [rows][cols];
		boolean [][] processed = new boolean[rows][cols];
		
		Stack <int[]> xStack = new Stack<int[]>();
		Stack <int[]> yStack = new Stack<int []>();
		
		xStack.add(new int[] {0,0});
		int i=0;
		int j=0;
		// first cell is always visited
		dist[i][j] = 1;
		
		while ( !(xStack.isEmpty() && yStack.isEmpty())  || 
				 (i==rows-1 && j==cols-1) ){
			System.out.print(("\n\nX-queue: "));
			xStack.forEach(elem -> 
						System.out.print("[" + elem[0] + "," + elem[1] + "], "));
			System.out.print("\nY-queue: ");
			yStack.forEach(elem -> 
						System.out.print("[" + elem[0] + "," + elem[1] + "], "));
			
			int [] node = getNextNodeToProcess(xStack, yStack, processed);
			if (node == null) continue;
			
			i = node[0];
			j = node[1];
			processed[i][j] = true;
			System.out.println("DISTANCE: " + dist[i][j]);
			
			for (int k=j+1; k<Math.min(cols, grid[i][j]+j+1); k++) {
				xStack.push(new int[] {i,k});
				if (dist[i][k] == 0 || dist[i][k]>dist[i][j]+1) {
					dist[i][k] = dist[i][j]+1;
				}
			}
			for (int k=i+1; k<Math.min(rows, grid[i][j]+i+1); k++) {
				yStack.push(new int[] {k,j});
				if (dist[k][j] == 0 || dist[k][j]>dist[i][j]+1) {
					dist[k][j] = dist[i][j]+1;
				}
			}
		}
		
		if (dist[rows-1][cols-1] == 0) {
			dist[rows-1][cols-1] = -1;
		}
		
		System.out.println("---------");
		for(int[] row: dist) {
			for (int elem: row) {
				System.out.print(elem + " ");
			}
			System.out.println();
		}
		
		return dist[rows-1][cols-1];
	}
	
	private int [] getNextNodeToProcess(Stack<int[]> xStack, 
						Stack<int[]> yStack, boolean [][] processed) {
		
		while (!xStack.isEmpty()) {
			int [] tmp = xStack.pop();
			if (!processed[tmp[0]][tmp[1]]) {
				System.out.println("\nProcessing X: [" + tmp[0]+","+tmp[1]+"]");
				return tmp;
			}
		}
		
		while (!yStack.isEmpty()) {
			int [] tmp = yStack.pop();
			if (!processed[tmp[0]][tmp[1]]) {
				System.out.println("\nProcessing Y: [" + tmp[0]+","+tmp[1]+"]");
				return tmp;
			}
		}
		
		return null;
	}
	
	public int minimumVisitedCelsWithGraph (int [][] grid) {
		/*
		 * start with building a graph, where each node is grid[i][j]
		 * and connections are based on the rule:
		 * Starting from the cell (i, j), you can move to one of the following cells:
		 *    - Cells (i, k) with j < k <= grid[i][j] + j (rightward movement), or
		 *    - Cells (k, j) with i < k <= grid[i][j] + i (downward movement).
		 *    
		 * 
		 */
		Map<String, Node> nodes = new HashMap<String, Node>();
		
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid[0].length; j++) {
				Node n = new Node(grid[i][j], i, j);
				String nStr = n.toString();
				n = nodes.getOrDefault(nStr, n);
				
				// process all nodes one can reach from (i,j) node
				List<Node> tmpXnodes = new ArrayList<Node>();
				for (int k=i+1; k<Math.min(grid[i].length, grid[i][j]+j+1); k++) {
					tmpXnodes.add(new Node(grid[i][k], i, k));
				}
				
				for (Node aNodeX: tmpXnodes) {
					if (!nodes.containsKey(aNodeX)) nodes.put(aNodeX.toString(), aNodeX);
					Node tmpANodeX = nodes.get(aNodeX.toString());
					if (!n.xList.contains(tmpANodeX) && !n.yList.contains(tmpANodeX)) {
						n.xList.add(tmpANodeX);
						if (tmpANodeX.numOfMoves == 0 || tmpANodeX.numOfMoves+1 > n.numOfMoves) {
							tmpANodeX.numOfMoves = n.numOfMoves+1;
						}
					}
					
				}
				
				List<Node> tmpYnodes = new ArrayList<Node>();
				for (int k=i+1; k<Math.min(grid.length, grid[i][j]+1+1); k++) {
					tmpXnodes.add(new Node(grid[k][j], k, j));
				}
				
				for (Node aNodeY: tmpXnodes) {
					if (!nodes.containsKey(aNodeY)) nodes.put(aNodeY.toString(), aNodeY);
					Node tmpANodeY = nodes.get(aNodeY.toString());
					if (!n.xList.contains(tmpANodeY) && !n.yList.contains(tmpANodeY)) {
						n.yList.add(tmpANodeY);
						if (tmpANodeY.numOfMoves == 0 || tmpANodeY.numOfMoves+1 > n.numOfMoves) {
							tmpANodeY.numOfMoves = n.numOfMoves+1;
						}
					}
				}
			}
		}
		int result = -1;
		Node lastNode = new Node(grid[grid.length-1][grid[0].length-1], grid.length-1, grid[0].length-1);
		lastNode = nodes.get(lastNode.toString());
		if (lastNode.numOfMoves > 0)
			result = lastNode.numOfMoves;
		return result;
	}
	
	
	private class Node {
		private int nodeVal;
		private int x;
		private int y;
		private int numOfMoves = 0;
		
		List<Node> xList;
		List<Node> yList;
		List<Node> adjacentNodes;
		
		private Node (int nodeVal, int x, int y) {
			this.nodeVal = nodeVal;
			this.x = x;
			this.y = y;
			xList = new ArrayList<MinNumCellsVisited.Node>();
			yList = new ArrayList<MinNumCellsVisited.Node>();
		}
		
		@Override
		public boolean equals(Object o) {
			if (!(o instanceof Node)) return false;
			
			Node n = (Node) o;
			
			return n.nodeVal == this.nodeVal 
					&& n.x == this.x 
					&& n.y == this.y; 
		}
		
		public String toString() {
			return this.nodeVal + "," + this.x + "," + this.y;
		}
	}
}
