class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n ;
        int i = 2;
        for (int j = 2; j < n; j++){
            if(nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
        
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1,1,1,2,2,3};
        int k1 = sol.removeDuplicates(nums1);
        System.out.print("Output: " + k1 + ", nums = ");
        for(int i = 0;i < k1;i++) System.out.print(nums1[i] + " ");
        System.out.println();

        int[] nums2 = {0,0,1,1,1,1,2,3,4};
        int k2 = sol.removeDuplicates(nums2);
        System.out.print("Output: " + k2 + ", nums = ");
        for( int i =0 ; i < k2;i++) System.out.print(nums2[i] + " ");
        System.out.println();
    }
}