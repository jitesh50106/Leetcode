class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        return check(words,s,0);
    }
    private boolean check(List<String> words, String s , int i){
        if(words.size()==i){
            return true;
        }
        if(words.get(i).charAt(0)!=s.charAt(i)){
            return false;
        }
        return check(words,s,i+1);
    }
}