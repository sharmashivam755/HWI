import java.util.*;

class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            if (i + 1 < s.length() && current < romanMap.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("III"));
        System.out.println(sol.romanToInt("LVIII"));
        System.out.println(sol.romanToInt("MCMXCIV"));
    }
}
