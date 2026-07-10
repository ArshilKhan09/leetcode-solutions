class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if( x < 9){
            return true;
        }
        int og = x ;
        int reverse = 0;
        while (x != 0) {
            int lastDigit = x % 10;                  
            reverse = (reverse * 10) + lastDigit; 
            x = x / 10;                         
        }

        return og == reverse;  
    }
}