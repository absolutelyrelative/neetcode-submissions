class Solution {

    public int check(int value, int target) {
        if(value > target)
            return 1;
        if(value < target)
            return -1;
        return 0;
    }

    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if( check(array[mid], target) > 0 )
                right = mid - 1;
            if( check(array[mid], target) < 0 )
                left = mid + 1;
            if( check(array[mid], target) == 0)
                return mid;
        }

        return -1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        // Number of rows
        int rows = matrix.length;
        int rowToSearch = 0;

        for(int rowIndex = 0; rowIndex < rows; rowIndex++) {
            if(matrix[rowIndex][0] <= target) {
                rowToSearch = rowIndex;
            }
        }
        System.out.println(rowToSearch);
        for(int i = 0; i < matrix[rowToSearch].length; i++) {
            System.out.println(matrix[rowToSearch][i]);
        }

        if(binarySearch(matrix[rowToSearch], target) != -1)
            return true;
        return false;
    }
}
