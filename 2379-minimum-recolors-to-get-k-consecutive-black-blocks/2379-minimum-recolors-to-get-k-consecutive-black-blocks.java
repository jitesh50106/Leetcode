class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c = 0;
        int min = 0;
        for(int i= 0;i<k;i++){
            char ch = blocks.charAt(i);
            if(ch=='W'){
                c++;
            }
        }
        min = c;
        for(int i = k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W'){
                c--;
            }
            if( blocks.charAt(i)=='W'){
                c++;
            }
            min = Math.min(c,min);
        }
        return min;
    }
}