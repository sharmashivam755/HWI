class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;

        for(int i = 1; i <= n;i++) {
            ans[i] = ans[i >> 1]  + (i & 1);       
        }
        return ans;
        
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int n1 = 2;
        int n2 = 5;

        int[] result1 = sol.countBits(n1);
        int[] result2 = sol.countBits(n2);

        System.out.print("Input: n = 2 -> Output: ");
        for (int num : result1) System.out.print(num + " ");
        System.out.println();

        System.out.print("Input: n = 5 -> Output: ");
        for (int num : result2) System.out.print(num + " ");
        System.out.println();
    }
}