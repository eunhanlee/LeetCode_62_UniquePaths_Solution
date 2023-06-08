import java.util.Arrays;

class Solution2 {
    /**
     * Calculates the number of unique paths from the starting cell (1, 1) to the destination cell (m, n)
     * in the given m x n grid.
     * Solve with dynamic programming
     *
     * @param m The number of rows in the grid.
     * @param n The number of columns in the grid.
     * @return The number of unique paths from the starting cell to the destination cell.
     */
    public int uniquePaths(int m, int n) {
        int[][] result = new int[m][n];

        // Initialize all cells in the first column to 1
        for (int i = 0; i < m; i++) {
            result[i][0] = 1;
        }

        // Initialize all cells in the first row to 1
        Arrays.fill(result[0], 1);

        // Compute the number of paths for the remaining cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }

        return result[m - 1][n - 1];
    }
}
