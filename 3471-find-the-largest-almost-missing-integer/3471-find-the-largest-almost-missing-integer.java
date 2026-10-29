class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] fre = new int[51];
        for(int j : nums){
            fre[j]++;
        }
        int ans = -1;
        for(int i = 0;i<n;i++){
            if(k==n || (fre[nums[i]]==1 && (k==1 || i==0 || i==n-1))){
                ans = Math.max(ans,nums[i]);
            }

        }
        return ans;
    }
}