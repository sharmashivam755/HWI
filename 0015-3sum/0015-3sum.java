class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();
     Arrays.sort(nums);

     for(int i = 0; i < nums.length - 2;i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        if (nums[i] > 0) break;

        int left = i + 1;
        int right = nums.length - 1;

        while ( left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum < 0 ) {
                left++;
            } else if (sum > 0) {
                right--;
            }else {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                while(left < right && nums[left] == nums[left + 1]) left++;
                while(left < right && nums[right] == nums[right - 1]) right--;

                left++;
                right--;
            }

        }
     }   

     return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(sol.threeSum(new int[]{0,1,1}));
        System.out.println(sol.threeSum(new int[]{0,0,0}));
    }
}