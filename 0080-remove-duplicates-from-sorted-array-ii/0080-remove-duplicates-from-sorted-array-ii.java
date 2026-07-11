class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0 ;
        int right = 2;
        int k = 2;

        while(right < nums.length){
            if(nums[left] == nums[right]){
                right++;
            }
            else{
                nums[left+2] = nums[right];
                left++;
                right++;
                k++;
            }
        }
        return k;
    }
}