import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        
        long value = 1; // first element is always 1
        result.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            value = value * (rowIndex - i + 1) / i;
            result.add((int) value);
        }

        return result;
    }
}