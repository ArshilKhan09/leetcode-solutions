class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0 ;
        int right = nums.length-1;
        int index = nums.length-1;
        
        while(left <= right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];

            if(leftsq > rightsq){
                arr[index] = leftsq;
                left++;
            }
            else{
                arr[index] = rightsq;
                right--;
            }
            index--;
        }

        return arr;
    }
}