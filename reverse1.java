import java.util.*;

class Solution {
    public String reverseWords(String s) {
       
        String[] words = s.split(" ");
        
      
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            wordBuilder.reverse();
            reversed.append(wordBuilder).append(" ");
        }
        
        
        if (reversed.length() > 0) {
            reversed.setLength(reversed.length() - 1);
        }
        
        return reversed.toString();
    }

    public static void main(String args[]) {
        String s = "God Ding";
        Solution solution = new Solution();
        System.out.println(solution.reverseWords(s));
    }

    public char[] isPowerOfTwo(int n) {
      return null;
    }

    public char[] isPowerOfFour(int n) {
      return null;
    }
}
