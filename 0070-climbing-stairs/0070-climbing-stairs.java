class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int first = 1;
        int second = 2;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 2;
        int n2 = 3;
        System.out.println("Input: n = " + n1 + " -> output: " + sol.climbStairs(n1));
        System.out.println("Input: n = " + n2 + " -> output: " + sol.climbStairs(n2));
    }
}
