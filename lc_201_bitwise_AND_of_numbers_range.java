/** LC-201
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

Example 1:

Input: [5,7]
Output: 4
Example 2:

Input: [0,1]
Output: 0
*/
class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if(m == 0 || n == 0) {
            return 0;
        }
        if(m == n) {
            return m;
        }
        int result = m;
        for(int i = m+1; i <= n; i++) {
            result = result & i;
            if(result == 0) {
                return 0;
            }
            if(i == n) {
                break;
            }
        }
        return result;
    }
}
