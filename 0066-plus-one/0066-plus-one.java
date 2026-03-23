class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, make it 0 and carry forward
            digits[i] = 0;
        }

        // If all digits were 9 (e.g., 999 → 1000)
        int[] result = new int[n + 1];
        result[0] = 1; // first digit becomes 1
        return result;
    }
}