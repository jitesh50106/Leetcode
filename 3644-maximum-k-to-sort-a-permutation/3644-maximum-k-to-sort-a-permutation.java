class Solution {
    public int sortPermutation(int[] nums) {
        int c = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                c &= nums[i];
            }
        }
        return Math.max(c, 0);
    }
}