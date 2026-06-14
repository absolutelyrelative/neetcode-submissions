class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        
        //[1,7,2,5,4,7,3,6]
        int left = 0;
        int right = heights.length - 1;

        while(left < right) {
            int d = right - left;
            int h = Math.min(heights[left], heights[right]);
            int area = d*h;
            maxArea = Math.max(maxArea, area);

            if(heights[left] < heights[right])
                left++;
            else if(heights[left] > heights[right])
                right--;
            else
                left++;
        }

        return maxArea;
        
    }
}
