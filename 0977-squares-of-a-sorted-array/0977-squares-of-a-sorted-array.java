class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] arr = new int[nums.length];
        int left = 0;
        int right = arr.length - 1;
        int i = arr.length-1 ;

        // for (int i = arr.length - 1; i >= 0; i--) {
        while(i >= 0){
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if (leftsq > rightsq) {
                arr[i] = leftsq;
                left++;
                i--;
            } else {
                arr[i] = rightsq;
                right--;
                i--;
            }
        }
        return arr;
    }
}