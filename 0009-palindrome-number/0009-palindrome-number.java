class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int original = x;

        for(int i = 0; x>0; i++){
            sum = sum * 10 + x % 10;
            x = x / 10;
        }
        return original == sum;
       
    }
}