class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n == 1) {
            return true;
        }
        boolean flag = false;
        int cache = n & 1;
        n = n >> 1;
        while(n != 0) {
            int result = n & 1;
            if(result == cache) {
                flag = false;
                break;
            } else {
                flag = true;
                cache = result;
            }
            n = n >> 1;
        }
        return flag;
    }
}
