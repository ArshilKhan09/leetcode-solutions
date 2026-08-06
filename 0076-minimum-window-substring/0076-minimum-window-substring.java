class Solution {

    static boolean correct(int[] have , int[] need){
        for(int i = 0 ; i < 128 ; i++){
            if(have[i] < need[i]){
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] have = new int[128];
        int[] need = new int[128];

        for(int i = 0 ; i < t.length() ; i++){
           need[t.charAt(i)]++;
        }

        int low = 0;
        int res = Integer.MAX_VALUE;
        int start = 0;

        for(int high = 0 ; high < s.length() ; high++){
            have[s.charAt(high)]++;

            while(correct(have , need)){
                int len = high-low+1;
                if(res > len){
                    res = len ;
                    start = low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }

        return res == Integer.MAX_VALUE ? "" : s.substring(start , start+res);
    }
}