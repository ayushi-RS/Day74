class Solution {
    // Using fast and slow pointer
    
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);
        
        if(slow == 1){
            return true;
        }
        
        return false;
    }
    
    private int findSquare(int n){
        int sum = 0;
        while(n > 0){
            int x = n%10;
            sum += x * x;
            n /= 10;
        }
        return sum;
    }
}