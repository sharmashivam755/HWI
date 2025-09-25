class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        // If needle is longer than haystack, it's impossible to match
        if (n > m) return -1;

        // Two-pointer window over haystack
        for (int i = 0; i <= m - n; i++) {
            int j = 0; // pointer for needle
            // Compare characters while they match
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If we matched all of needle, return starting index
            if (j == n) return i;
        }

        return -1; // Not found
    }
}