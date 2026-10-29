class Solution {
    public int buyChoco(int[] prices, int money) {
        int m = Integer.MAX_VALUE;
        int n = Integer.MAX_VALUE;
        for(int j : prices){
            if(j<m){
                n = m;
                m = j;
            }
            else if (j<n){
                n = j;
            }
        }
        int c = m+n;
        if(c<=money){
            return money-c;
        }
        return money;
    }
}