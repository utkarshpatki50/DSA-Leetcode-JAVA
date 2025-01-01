import java.util.*;

class Solution {
    public String intToRoman(int num) {
        
        Map<Integer, String> roman = new TreeMap<>(Collections.reverseOrder());
        roman.put(1000, "M");
        roman.put(900, "CM");
        roman.put(500, "D");
        roman.put(400, "CD");
        roman.put(100, "C");
        
        roman.put(90, "XC");
        roman.put(50, "L");
        roman.put(40, "XL");
        roman.put(10, "X");
        roman.put(9, "IX");
        roman.put(5, "V");
        roman.put(4, "IV");
        roman.put(1, "I");

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : roman.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();
            
            while (num >= value) {
                result.append(symbol);  
                num -= value; 
            }
        }
        return result.toString();
    }
}
