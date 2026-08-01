class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character ,Integer> map = new HashMap<>();
        int low = 0;
        int res = 0;

        for(int high = 0 ; high < s.length() ; high++){
            map.put(s.charAt(high) , map.getOrDefault(s.charAt(high) , 0)+1);

            while(map.get(s.charAt(high)) > 1){
                map.put(s.charAt(low) , map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low)) == 0){
                    map.remove(s.charAt(low));
                }
                low++;
            }
            res = Math.max(res , high-low+1);
        }
        return res;
    }
}