LC-318
/*
Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

Example 1:

Input: ["abcw","baz","foo","bar","xtfn","abcdef"]
Output: 16 
Explanation: The two words can be "abcw", "xtfn".
Example 2:

Input: ["a","ab","abc","d","cd","bcd","abcd"]
Output: 4 
Explanation: The two words can be "ab", "cd".
Example 3:

Input: ["a","aa","aaa","aaaa"]
Output: 0 
Explanation: No such pair of words.
*/
class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i = 0; i < words.length; i++) {
            String s1 = words[i];
            for(int j = i+1; j < words.length; j++) {
                String s2 = words[j];
                if(!hasSameChars(s1, s2)) {
                    int length = s1.length() * s2.length();
                    if(length > max) {
                        max = length;
                    }
                }
            }
        }
        return max;
        
    }
    
    private static boolean hasSameChars(String s1, String s2) {
        byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();
        for(byte x: b1) {
            for(byte y:b2) {
                if((x ^ y) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
