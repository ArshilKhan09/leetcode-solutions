class Solution {
    public int totalFruit(int[] fruits) {
        int[] freq = new int[100001];

        int distinct = 0;
        int low = 0;
        int ans = 0;

        for (int high = 0; high < fruits.length; high++) {

            if (freq[fruits[high]]++ == 0)
                distinct++;

            while (distinct > 2) {
                if (--freq[fruits[low]] == 0)
                    distinct--;
                low++;
            }

            ans = Math.max(ans, high - low + 1);
        }

        return ans;
    }
}