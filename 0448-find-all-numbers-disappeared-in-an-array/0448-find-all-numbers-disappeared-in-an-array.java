class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();
        int[] arr=new int[nums.length+1];
        for(int x:nums){
            arr[x]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                result.add(i);
            }
        }

        return result;
    }
}