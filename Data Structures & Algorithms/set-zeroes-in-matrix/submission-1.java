class Solution {
    public void setZeroes(int[][] matrix) {
        char[] markedColumns = new char[matrix[0].length];
        char[] markedRows = new char[matrix.length];

        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                if(matrix[row][column] == 0) {
                    markedRows[row] = 'X';
                    markedColumns[column] = 'X';
                }
            }
        }

        for(int x = 0; x < markedColumns.length; x++) {
            if(markedColumns[x] == 'X') {
                for(int row = 0; row < matrix.length; row++) {
                    matrix[row][x] = 0;
                }
            }
        }

        for(int y = 0; y < markedRows.length; y++) {
            if(markedRows[y] == 'X') {
                for(int column = 0; column < matrix[y].length; column++) {
                    matrix[y] = new int[matrix[y].length];
                }
            }
        }

    }
}
