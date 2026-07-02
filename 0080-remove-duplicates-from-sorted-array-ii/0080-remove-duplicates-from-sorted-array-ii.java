class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int K = 2 ;
        int j = 2 ;

        while(j<nums.length){
            if(nums[i] == nums[j]){
                j++ ;
            }
            else{
                nums[i+2] = nums[j];
                i++;
                K++;
                j++;
            }
        }
        return K;
    }
}