class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> integerList = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;

        while(left < right && top < bottom) {
            for(int leftPtr = left; leftPtr < right; leftPtr++) {
                integerList.add(matrix[top][leftPtr]);
            }
            top++;
            for(int topPtr = top; topPtr < bottom; topPtr++) {
                integerList.add(matrix[topPtr][right - 1]);
            }
            right--;
            if(top >= bottom || right <= left) {
                break;
            }
            for(int rightPtr = right - 1; left <= rightPtr; rightPtr--) {
                integerList.add(matrix[bottom - 1][rightPtr]);
            }
            bottom--;
            for(int bottomPtr = bottom - 1; top <= bottomPtr; bottomPtr--) {
                integerList.add(matrix[bottomPtr][left]);
            }
            left++;
        }

        return integerList;
    }
}
