class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       /* int res = Integer.MAX_VALUE;
        int sum =0;

        int low=0, high =0;

        while(high < nums.length){
            sum = sum + nums[high];
            while(sum >= target){
                res = Math.min(res, high-low+1);
                sum = sum - nums[low];
                low++;
            }
            high++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
        */



        int left =0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;

        for(int right=0;right<nums.length;right++){
            sum +=nums[right];

            while(sum>=target){
                minlen=Math.min(minlen,right-left+1);
                sum -=nums[left];
                left++;
            }
        }
        System.gc();
        return minlen==Integer.MAX_VALUE ?0:minlen;
    }
}