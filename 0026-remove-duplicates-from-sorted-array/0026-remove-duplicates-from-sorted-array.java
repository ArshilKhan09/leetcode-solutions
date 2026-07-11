class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0 ;
        int right = 1;
        int k = 1 ;

        while(right < nums.length){
            if(nums[left] == nums[right]){
                right++;
            }
            else {
                int temp = nums[left+1];
                nums[left+1] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }
            k = left+1;
        }
        return k;
    }
}