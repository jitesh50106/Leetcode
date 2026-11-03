class Solution {
    public int minMoves(int[] nums) {
        int c = 0;
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>k){
                k = nums[i];
            }
        }
        for(int i = 0;i<nums.length;i++){
            c+=Math.abs(nums[i]-k);
        }
        return c;
    }
}