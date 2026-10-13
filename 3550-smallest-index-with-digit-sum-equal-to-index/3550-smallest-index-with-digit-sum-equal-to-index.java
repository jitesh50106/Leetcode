class Solution {
    public int smallestIndex(int[] nums) {
        for(int i =0;i<nums.length;i++){
            int s = 0;
            int n = nums[i];
            while(n>0){
                int r = n%10;
                s+=r;
                n/=10;
            }
            if(s==i){
                return i ;
            }
        }
        return -1;
    }
}