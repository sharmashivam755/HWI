class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices) {
            if(price < minPrice){
                minPrice = price;

            }else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;

            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};

        System.out.println("Input: [7,1,5,3,6,4] -> Output: " + sol.maxProfit(prices1));
        System.out.println("Input: [7,6,4,3,1] -> Output: " + sol.maxProfit(prices2));
    }
}