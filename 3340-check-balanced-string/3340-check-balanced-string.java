class Solution {
    public boolean isBalanced(String num) {
        int e = 0;
        int o =0;
        for(int i =0;i<num.length();i++){
            int d = num.charAt(i) - '0';
            if(i%2==0){
                e+=d;
            }
            else{
                o+=d;
            }
        }
        return e == o;
    }
}