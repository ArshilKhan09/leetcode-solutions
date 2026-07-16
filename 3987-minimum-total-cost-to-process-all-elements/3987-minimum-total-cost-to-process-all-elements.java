class Solution {
    public int minimumCost(int[] nums, int k) {
       final long MOD = 1_000_000_007L;

        long cnt = 0;
        long cur = k;

        for (int x : nums) {
            long diff = (long) x - cur;

            if (diff > 0) {
                long ops = (diff + k - 1L) / k;
                cnt += ops;
                cur += ops * (long) k;
            }

            cur -= x;
        }

        cnt %= MOD;
        return (int) ((cnt * (cnt + 1) / 2) % MOD);
    }
}