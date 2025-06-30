class Solution {
    public int uniquePaths(int m, int n) {
        int[][] ans = new int[m][n];
        for(int i =m-1;i>=0;i--) {
            for(int j = n-1;j>=0;j--){

                if(i==m-1|| j == n-1) {
                    ans[i][j] = 1;
                }else {
                    int pos1 = ans[i][j+1];
                    int pos2 = ans[i+1][j];
                    ans[i][j] = pos1 + pos2;
                }
            }
        }
        return ans[0][0];
    }
}
