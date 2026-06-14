class Solution {
    public boolean isPalindrome(String s) {
        // String cleanup
        String filtered = s.replaceAll("([^a-zA-Z0-9])", "").toLowerCase();
        System.out.println(filtered);
        int leftPointer = 0;
        int rightPointer = filtered.length() - 1;

        while(leftPointer < rightPointer) {
            if(filtered.charAt(leftPointer) != filtered.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
        
    }
}
