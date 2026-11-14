class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n2<n1){
            return false;
        }
        int fre[] = new int[26];
        int fre2[] = new int[26];
        for(int i = 0;i<n1;i++){
            fre[s1.charAt(i)-'a']++;
            fre2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(fre,fre2)){
            return true;
        }
        for(int i = n1;i<n2;i++){
            fre2[s2.charAt(i)-'a']++;
            fre2[s2.charAt(i-n1)-'a']--;
            if(Arrays.equals(fre,fre2)){
            return true;
            }
        }       
        return false;
    }
}