class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        Set<Integer> primes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        for(int i = L; i <= R; i++) {
            int ones = findSetBits(i);
            if(primes.contains(ones)) {
                count++;
            }
        }
        return count;
    }
    
    private int findSetBits(int n) {
        int count = 0;
        if(n == 0) {
            return 0;
        }
        int result = findSetBits(n >> 1);
        if((n & 1) == 1) {
            count++;
        }
        return result + count;
    }
}
