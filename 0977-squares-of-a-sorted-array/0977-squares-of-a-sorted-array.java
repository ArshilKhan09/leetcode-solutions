class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = arr.length-1;
        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = nums[i]*nums[i];
        }
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = arr[i];
        }

      return ans;
    }
}