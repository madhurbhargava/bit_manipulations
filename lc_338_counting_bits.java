class Solution {
    public int[] countBits(int num) {
        int arr[] = new int[num+1];
        for(int i = 0; i <= num; i++) {
            int result = countOnes(i);
            arr[i] = result;
        }
        return arr;
    }
    
    private int countOnes(int n) {
        int count = 0;
        if(n == 0) {
            return 0;
        }
        int result = countOnes(n >> 1);
        int interim = n & 1;
        if(interim == 1) {
            count++;
        }
        return result+count;
    }
}
