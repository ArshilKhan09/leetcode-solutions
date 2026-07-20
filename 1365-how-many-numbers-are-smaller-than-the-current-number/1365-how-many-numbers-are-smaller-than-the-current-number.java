class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            nums[i] = 0;
            for(int j=0;j<x;j++){
                nums[i]+=arr[j];
            }
        }
        return nums;
    }
}