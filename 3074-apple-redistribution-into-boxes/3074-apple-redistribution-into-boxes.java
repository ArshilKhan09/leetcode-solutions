import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;
        for (int a : apple) {
            totalApples += a;
        }
        Arrays.sort(capacity);
        int usedBoxes = 0;
        int remainingApples = totalApples;

        for (int i = capacity.length - 1; i >= 0; i--) {
            remainingApples -= capacity[i];
            usedBoxes++;

            if (remainingApples <= 0) {
                return usedBoxes;
            }
        }
        return usedBoxes; 
    }
}
