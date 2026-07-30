class Solution {
    public int minimumPushes(String word) {
        HashMap<Integer, List<Character>> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int pushes = 1;
        int pushesCount = 0;
        int setSize = 0;
        for(char ch : word.toCharArray()){
            if(setSize == 8){
                setSize = 0;
                pushes++;  
            } 

            set.add(ch);
            setSize++;
            pushesCount += pushes;   
        }

        return pushesCount;
    }
}