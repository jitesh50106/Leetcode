class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less=0;
        int eq=0;
        List<Integer> res=new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]<target){
                less++;
            }
            else if(nums[i]==target){
                eq++;
            }
        }
        for(int j=less;j<eq+less;j++){
            res.add(j);
        }
        return res;
    }
}