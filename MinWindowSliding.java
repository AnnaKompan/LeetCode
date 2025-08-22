import java.util.HashMap;
import java.util.Map;

public class MinWindowSliding {
    public static void main(String[] args) {
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        String s2 = "a";
        String t2 = "a";
        String s3 = "a";
        String t3 = "aa";
        

        System.out.println(
                "The minimum window substring in " + s1 + " that includes " + t1 + " is  " + minWindow(s1, t1));
        System.out.println(
                "The minimum window substring in " + s2 + " that includes " + t2 + " is  " + minWindow(s2, t2));
        System.out.println("The minimum window substring in " + s3 + " that includes " + t3 + " is  " + minWindow(s3, t3));
        
    }

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> tFreq = new HashMap<>();
        for(char c: t.toCharArray()){
            tFreq.put(c, tFreq.getOrDefault(c, 0) +1);
        }
        int left = 0;
        int right = 0;

        int minLen = Integer.MAX_VALUE;
        int minStartIdx = 0;
        Map<Character, Integer> wFreq = new HashMap<>();
        while(right < s.length()){
            // expand
            char rChar = s.charAt(right);
            wFreq.put(rChar, wFreq.getOrDefault(rChar, 0) + 1); 
            // narrow down
            while(isWindowsComplete(wFreq, tFreq) && left <= right){
                int currLen = right - left + 1;
                //update answer if substring fits
                if(currLen < minLen){
                    minLen = currLen;
                    minStartIdx = left;
                }
                char lChar = s.charAt(left);
                wFreq.put(lChar, wFreq.get(lChar) - 1);
                left ++;
            }
            right ++;
        }
        if (minLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(minStartIdx, minStartIdx + minLen);
        // s = "ADOBECODE.BANC", t = "ABC"
        // tFreq = {A:1, B:1: C:1}
        // windowFreq = {A:1(0),D:1,O:1,B:1(0),E:1,C:1(0) (6)O:2,D:2,E:2,B:2,A:1,(10)N:1,C:1(7)} each time drop unneeded el(until window is full)
    }
    private static boolean isWindowsComplete(Map<Character, Integer> wFreq, Map<Character, Integer> tFreq){
        for (var entry: tFreq.entrySet()){
            Integer existing = wFreq.get(entry.getKey());
            if (existing == null || existing < entry.getValue()){
                return false;
            }
        }
        return true;
    }
}
