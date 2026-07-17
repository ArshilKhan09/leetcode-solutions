class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int high = nums[0];
        int right=-1;

        for(int i=0 ; i < nums.length ; i++){
            high = Math.max(high,nums[i]);
            if(nums[i] < high){
                right=i;
            }
        }

        int low = nums[nums.length-1];
        int left=-1;
        for(int i=nums.length-2 ;  i >= 0 ; i--){
            low = Math.min(low,nums[i]);
            if(nums[i] > low){
                left=i;
            }
        }
        if(right < 0){
            return 0;
        }
        
        return right-left + 1;
    }
}