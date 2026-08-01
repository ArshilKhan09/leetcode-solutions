class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        int n = fruits.length;
        int maxLen = 0;
        
        while(high < n)
        {
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            while(map.size()>=3)
            {
                map.put(fruits[low],map.get(fruits[low])-1);
                if(map.get(fruits[low]) == 0){ 
                    map.remove(fruits[low]);
                }
                low++;
            }

            maxLen = Math.max(maxLen,(high-low+1));
            high++;
        }
        return maxLen;
    }
}