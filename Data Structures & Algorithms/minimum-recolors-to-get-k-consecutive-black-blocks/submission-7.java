class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int right = k - 1;
        int ops = Integer.MAX_VALUE;

        while(right < blocks.length()) {
            int whites = 0;
            // Count the number of whites
            for(int i = left; i <= right; i++) {
                if(blocks.charAt(i) == 'W') whites++;
            }
            
            ops = Math.min(whites, ops);
            //System.out.print("Whites "); System.out.print(whites);
            //System.out.print(" currentOps "); System.out.print(currentOps);
            //System.out.println();
            left++;
            right++;
        }

        return ops;
        
    }
}