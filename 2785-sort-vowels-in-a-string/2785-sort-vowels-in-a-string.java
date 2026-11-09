class Solution {
    private boolean isvowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1 ;
    }
    public String sortVowels(String s) {
        List<Character> ls = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(isvowel(ch)){
                ls.add(ch);
            }
        }
        Collections.sort(ls);
        StringBuilder ans = new StringBuilder(s);
        int j = 0;
        for(int i = 0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                ans.setCharAt(i,ls.get(j));
                j++;
            }
        }
         return ans.toString();
    }
}