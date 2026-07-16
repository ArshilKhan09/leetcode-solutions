class Solution {
    public int minimumCost(int[] nums, int k) {
       final long MOD = 1_000_000_007L;

        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long operations = (sum + k - 1L) / k - 1;

        long a = operations;
        long b = operations + 1;

        if ((a & 1) == 0) {
            a /= 2;
        } else {
            b /= 2;
        }

        long answer = ((a % MOD) * (b % MOD)) % MOD;

        return (int) answer;
    }
}