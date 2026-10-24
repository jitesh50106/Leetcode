class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean e = true;
        boolean j = true;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                e=false;
            }
            if(nums[i]<nums[i+1]){
                j = false;
            }
        }
        if(e==true || j == true){
            return true;
        }
        else{
            return false;
        }
    }
}