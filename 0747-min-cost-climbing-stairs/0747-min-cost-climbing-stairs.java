class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int first = cost[0];
        int second = cost[1];

        for(int i = 2;i<n;i++){
            int current = cost[i] + Math.min(first, second);
            first = second;
            second = current;
        }
        return Math.min(first, second);

        }
        public static void main(String[] args){
            Solution sol = new Solution();
            int[] cost1 = {10,15,20};
            int[] cost2 = {1,100,1,1,1,100,1,1,100,1};
        System.out.println("Input: [10,15,20] -> Output: " + sol.minCostClimbingStairs(cost1));
          System.out.println("Input: [1,100,1,1,1,100,1,1,100,1] -> Output: " + sol.minCostClimbingStairs(cost2));
        
    }
}