class Solution {
    public int maxArea(int[] arr) {
        int left = 0 ;
        int right = arr.length-1;
        int area = 0;

        while(left < right){
            int leftHeight = arr[left];
            int rightHeight = arr[right];

            area = Math.max(area , Math.min(leftHeight, rightHeight) * (right - left));

            if (leftHeight < rightHeight) {
                while (left < right && arr[left] <= leftHeight) {
                    left++;
                }
            }
            else {
                while (left < right && arr[right] <= rightHeight) {
                    right--;
                }
            }
        }
        return area;
    }
}