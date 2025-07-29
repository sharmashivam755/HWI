class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if ( n == 1 ) return nums[0];
        if ( n == 2 ) return Math.max(nums[0], nums[1]);
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        int maxAmount = second ;

        for(int i = 2;i< n;i++) {
            maxAmount = Math.max(second, first + nums[i]);
            first = second;
            second = maxAmount;

        }
        return maxAmount;

        
    }
    public static void main(String[] args){
        Solution sol = new Solution();

        int[] nums1 = {1,2,3,1};
        int[] nums2 = {2,7,9,3,1};

        System.out.println("Input: [1,2,3,1]  -> Output: " + sol.rob(nums1));
        System.out.println("Input: [2,7,9,3,1]  -> Output: " + sol.rob(nums2));
    }
}