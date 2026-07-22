class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(num, min);
            max = Math.max(max, num);
        }

        int[] count = new int[max - min + 1];
        int windowMax = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            count[nums[i] - min]++;
            windowMax = Math.max(windowMax, nums[i]);
        }

        result[0] = windowMax;

        for (int i = k; i < n; i++) {
            count[nums[i] - min]++;
            if (nums[i] > windowMax) {
                windowMax = nums[i];
            }

            int outgoing = nums[i - k];
            count[outgoing - min]--;
            if (outgoing == windowMax && count[windowMax - min] == 0) {
                while (count[windowMax - min] == 0)
                    windowMax--;
            }

            result[i - k + 1] = windowMax;
        }

        return result;
    }
}