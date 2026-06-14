class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = nums1.length - n - 1;
        int p2 = nums2.length - 1;
        int p3 = p1 + n;

        // 10, 20, 20, 40, 0, 0
        //              p1
        // 1, 2
        //    p2

        while(p2 >= 0) {
            if(p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p3] = nums1[p1];
                p3--;
                p1--;
            } else {
                nums1[p3] = nums2[p2];
                p3--;
                p2--;
            }
        }
    }
}