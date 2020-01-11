/* LC-476
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
*/
class Solution {
    public int findComplement(int num) {
        //find number of bits
        int bits = (int) ((Math.log(num) + Math.log(1)) / Math.log(2)) + 1;
        
        //special case handling if number is 0
        if(bits < 0) {
            bits = 1;
        }
        
        int mask = -1;
        if(bits == 31) {
            mask = ((int)Math.pow(2, bits));
        } else {
            mask = ((int)Math.pow(2, bits)) - 1;
        }
        
        //xor with the mask
        return num ^ mask;
    }
}
