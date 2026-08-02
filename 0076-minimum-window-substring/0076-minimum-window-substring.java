class Solution {

    boolean fun(int[] need, int[] have) {
        for(int i = 0; i < 128; i++) {
            if(have[i] < need[i]) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        
        if(s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];
        int[] have = new int[128];

        for(char c : t.toCharArray()) {
            need[c]++;
        }

        int low = 0;
        int start = 0;
        int res = Integer.MAX_VALUE;

        for(int high = 0; high < s.length(); high++) {

            have[s.charAt(high)]++;

            while(fun(need, have)) {

                int len = high - low + 1;

                if(len < res) {
                    res = len;
                    start = low;
                }

                have[s.charAt(low)]--;
                low++;
            }
        }
        return res == Integer.MAX_VALUE ? "" : s.substring(start, start + res);
    }
}