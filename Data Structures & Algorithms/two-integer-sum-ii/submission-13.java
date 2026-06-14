class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = 1;
        int[] res = {0, 0};

        // 1, 2, 3, 4
        // L, R
        while(left < numbers.length) {
            System.out.print(left);
            System.out.print(" ");
            System.out.println(right);
            if(right < numbers.length &&
                numbers[left] + numbers[right] == target) {
                    res[0] = left + 1;
                    res[1] = right + 1;
                    break;
                }
            else if(right < numbers.length &&
                numbers[left] + numbers[right] != target) {
                    right++;
                }
            else if(right >= numbers.length) {
                left++;
                right = left + 1;
            }
        }

        return res;
    }
}
