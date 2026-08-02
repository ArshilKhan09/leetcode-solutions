class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int low=0;
        int res=0;
        int maxFreq=0;
        for(int high=0; high < s.length(); high++){
            freq[s.charAt(high) -'A']++;
            maxFreq=Math.max(maxFreq, freq[s.charAt(high)-'A']);

            while((high-low+1) - maxFreq > k){
                freq[s.charAt(low) -'A']--;
                low++;
            }
            res = Math.max(res , high-low+1);
        }
        return res;
    }
}