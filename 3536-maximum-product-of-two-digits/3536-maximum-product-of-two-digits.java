class Solution {
    public int maxProduct(int n) {
        int[] digits = Integer.toString(n).chars().map(c -> c - '0').toArray();

        Arrays.sort(digits);
        int max = 0;
        int i = digits.length-1;
        
        if(digits.length >= 1){
            max = digits[i] * digits[i-1]; 
        }
        else{
            return digits[i];
        }
        return max;
    }
}