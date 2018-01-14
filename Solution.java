/* This is solution code for a leetcode problem:
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
 * You may assume all four edges of the grid are all surrounded by water.
 * 
 * Choosing this solution code is because it's solving a concrete problem and it's short and compact to understand
 * It also reveals my coding style to some extend 
 */
 


public class Solution {
	char[][] m_grid;
	public int numIslands(char[][] grid) {
		m_grid = grid;
		int result = 0;
        for(int row = 0; row < m_grid.length; ++row) {
        	for(int col = 0; col < m_grid[0].length; ++col) {
        		if(m_grid[row][col] == '1') {
        			result++;
        			traverse(row, col);
        		}
        	}
        }
        return result;
    }
	
	public void traverse(int row, int col) {
		m_grid[row][col] = '0';
		if(col + 1 < m_grid[0].length && m_grid[row][col + 1] == '1') {
			traverse(row, col + 1);
		}
		if(col - 1 >= 0 && m_grid[row][col - 1] == '1') {
			traverse(row, col - 1);
		}
		if(row + 1 < m_grid.length && m_grid[row + 1][col] == '1') {
			traverse(row + 1, col);
		}
		if(row - 1 >= 0 && m_grid[row - 1][col] == '1') {
			traverse(row - 1, col);
		}
	}

}
