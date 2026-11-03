class Solution {
    public int minMoves(int[] nums) {        
        int max = Integer.MIN_VALUE;
        int c = 0;
        for(int num : nums){
            max = Math.max(max, num);
            c += num;
        }

        return nums.length * max - c;
    }
}