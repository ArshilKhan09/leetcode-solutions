class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] map = new int[128];

        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int start = 0;
        int end = 0;

        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        char[] ch = s.toCharArray();

        while (end < ch.length) {
            char endChar = ch[end];
            end++;

            if (map[endChar] > 0) {
                count--;
            }
            
            map[endChar]--;
            while (count == 0) {

                if (end - start < minLen) {
                    minLen = end - start;
                    startIndex = start;
                }

                char startChar = ch[start];
                start++;

                if (map[startChar] == 0) {
                    count++;
                }

                map[startChar]++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return new String(ch, startIndex, minLen);
    }
}