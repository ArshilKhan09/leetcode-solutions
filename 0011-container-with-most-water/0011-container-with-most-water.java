class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;
        while (left < right) {

            int width = right - left;
            int length = Math.min(arr[left], arr[right]);

            int currentArea = length * width;
            maxArea = Math.max(maxArea, currentArea);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.gc();
        return maxArea;
    }
}