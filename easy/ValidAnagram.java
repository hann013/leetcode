// Valid anagram

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.equals(t)) {
            return true;
        }
        
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        int numUniqueChars = 0;
        
        // track all characters in s
        for(char c : s.toCharArray()) {
            if (letters.get(c) == null) {   
                // new unique letter
                letters.put(c, 1);
                numUniqueChars++;
            } else {                       
                // repeating letter
                letters.put(c, letters.get(c)+1);
            }
        }
        
        char[] tChars = t.toCharArray();
        
        // look through all characters in t
        for (int i = 0; i < tChars.length; i++) {
            char c = tChars[i];
            
            // found letter in t that's not in s
            if (letters.get(c) == null) || letters.get(c) <= 0) {
                return false;
            }
            
            // found all instances of a letter
            if (letters.put(c, letters.get(c) - 1) == 1) {
                numUniqueChars--;
                
                // gone through all the letters
                if (numUniqueChars == 0) {
                    // check if at last letter
                    return i == tChars.length - 1;
                }
            }
        }
        
        return false;
    }
}