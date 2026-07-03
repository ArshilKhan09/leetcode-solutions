class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }
        int low = 0;
        int sum = 0;
        int count = 0;
        for (int high = 0; high < nums.length; high++) {

            sum += nums[high];

            while (sum > goal) {
                sum -= nums[low];
                low++;
            }

            count += (high - low + 1);
        }

        return count;
    }
}