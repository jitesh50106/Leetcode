class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        int s = 0;
        while(n>0){
            int rem = n%10;
            if(rem!=0){
                x = x*10+rem;
                s+=rem;
            }
            n/=10;
        }
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return (long)rev*s;
    }
}