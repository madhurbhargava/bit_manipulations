/** LC-137 - Single Number II
Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,3,2]
Output: 3
Example 2:

Input: [0,1,0,1,0,1,99]
Output: 99
*/
class Solution {
    public int singleNumber(int[] nums) {
        int[] digits = new int[32];
        for(int i = 0; i< nums.length; i++) {
            int num = nums[i];
            int count = 31;
            while(num != 0) {
                if((num & 1) == 1) {
                    int counter = digits[count];
                    counter++;
                    digits[count] = counter;
                }
                num >>>= 1;
                count--;
            }
        }
        
        int num = getNum(digits);
        return num;
    }
    
    private int getNum(int[] digits) {
        int num = 0;
        for(int i=0; i<digits.length; i++){
            if(digits[i]%3==1)
                num += 1;
            if(i==31)
                continue;
            num <<= 1;
        }
        return num;
    }
}
