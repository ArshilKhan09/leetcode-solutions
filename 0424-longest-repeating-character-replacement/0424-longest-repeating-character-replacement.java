class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0;
        int maxFreq = 0;
        int res = 0;

        for (int high = 0; high < s.length(); high++) {
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(high)));

            while ((high - low + 1) - maxFreq > k) {
                map.put(s.charAt(low), map.get(s.charAt(low)) - 1);
                low++;
            }
            res = Math.max(res, high - low + 1);
        }

        return res;
    }
}