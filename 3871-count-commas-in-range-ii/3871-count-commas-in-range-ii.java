class Solution {
    public long countCommas(long n) {
        long c = 1000;
        long a = 0;
        while(c<=n){
            a+=n-c+1;
            c*=1000;
        }
        return a;
    }
}