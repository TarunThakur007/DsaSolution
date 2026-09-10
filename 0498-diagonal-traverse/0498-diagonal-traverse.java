class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];

        int row = 0;
        int col = 0;
        int index = 0;

        // There are m + n - 1 diagonals
        for (int diagonal = 0; diagonal < m + n - 1; diagonal++) {

            // Even diagonals: move up-right
            if (diagonal % 2 == 0) {
                while (row >= 0 && col < n) {
                    result[index++] = mat[row][col];
                    row--;
                    col++;
                }

                // Correct position after going out of bounds
                if (col == n) {
                    row += 2;
                    col--;
                } else {
                    row++;
                }

            // Odd diagonals: move down-left
            } else {
                while (row < m && col >= 0) {
                    result[index++] = mat[row][col];
                    row++;
                    col--;
                }

                // Correct position after going out of bounds
                if (row == m) {
                    row--;
                    col += 2;
                } else {
                    col++;
                }
            }
        }

        return result;
    }
}