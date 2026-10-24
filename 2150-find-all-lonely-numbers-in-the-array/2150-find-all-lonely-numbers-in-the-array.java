class Solution {
    public List<Integer> findLonely(int[] nums) {
       int max=0;
       for(int i: nums) max=Math.max(max,i);
       int[] freq=new int[max+2];
       for(int i:nums) freq[i]++;
        List<Integer> res=new ArrayList<>(); 
        for(int i:nums)
        {
            if(freq[i]==1 && (i==0||freq[i-1]==0) && freq[i+1]==0) res.add(i);
        }
        return res;
   }
}