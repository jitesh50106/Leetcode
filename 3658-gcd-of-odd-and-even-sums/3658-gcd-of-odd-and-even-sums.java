class Solution {
    public int gcdOfOddEvenSums(int n) {
        int o = n*n;
        int e= n*(n+1);
        return gcd(o,e);
    }
    private int gcd(int a , int b){
        while(b!=0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
}