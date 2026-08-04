class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        int[] arr = new int[101];

        List<Integer> ans = new ArrayList<>();
        for(int i:nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
            arr[i]+=1;
        }
        while(min <= max){
            if(arr[min] == 0){
                ans.add(min);
            }
            min++;
        }
        return ans;
    }
}