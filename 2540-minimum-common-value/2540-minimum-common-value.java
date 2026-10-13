class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i =0;
        int j =0;
        while(nums1.length>i && nums2.length > j){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else {
                j++;
            }
        }
        return -1;

    }
}