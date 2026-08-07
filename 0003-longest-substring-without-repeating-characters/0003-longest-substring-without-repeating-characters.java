class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int low = 0;
        int ans = 0;

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);
            freq[ch]++;

            while (freq[ch] > 1) {
                freq[s.charAt(low)]--;
                low++;
            }

            ans = Math.max(ans, high - low + 1);
        }

        return ans;
    }
}