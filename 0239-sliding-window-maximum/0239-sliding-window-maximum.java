class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] post = new int[n];

        for (int i=0; i< n; i+=k) {
            int s = i;
            int e = Math.min(i+k, n);

            int max = Integer.MIN_VALUE;
            for (int sp=s; sp<e; sp++) {
                max = Math.max(max, nums[sp]);
                pre[sp] = max;
            }

            max = Integer.MIN_VALUE;
            while (e > s) {
                max = Math.max(max, nums[e-1]);
                post[--e] = max;
            }
        }

        int ans[] = new int[n-k+1];
        for (int i=0; i<n-k+1; i++) {
            ans[i] = Math.max(post[i], pre[i+k-1]);
        }

        return ans;
    }
}