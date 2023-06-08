class Solution {
    /**
     * Calculates the number of unique paths from the starting cell (1, 1) to the destination cell (m, n)
     * in a grid of size m x n using combinatorics.
     * olve with combination
     *
     * @param m The number of rows in the grid.
     * @param n The number of columns in the grid.
     * @return The number of unique paths from the starting cell to the destination cell.
     */
    public int uniquePaths(int m, int n) {
        int mathN = m + n - 2; // Total elements to choose from (m+n-2)
        int mathR = (m > n) ? n - 1 : m - 1; // Number of elements to be selected (minimum of m-1 or n-1)

        long result = 1; // Use long to handle large numbers

        // Calculate the result using combinatorics formula (nCr)
        for (int i = 1; i <= mathR; i++) {
            result = result * (mathN - mathR + i) / i;
        }

        return (int) result;
    }
}
