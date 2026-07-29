class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < n; i++){
            if (target[j] == i + 1){
                result.add("Push");
                j++;
                if (j == target.length) break;
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }
}