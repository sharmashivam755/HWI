class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0, j =0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
        
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "abc", t1 = "ahbgdc";
        String s2 = "axc", t2 = "ahbgdc";

     System.out.println("Input: s = \"abc\", t = \"ahbgdc\" -> Output: " + sol.isSubsequence(s1, t1));
        System.out.println("Input: s = \"axc\", t = \"ahbgdc\" -> Output: " + sol.isSubsequence(s2, t2));
    }
}