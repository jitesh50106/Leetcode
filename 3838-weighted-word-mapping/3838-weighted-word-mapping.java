class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int sum = 0;

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                sum += weights[ch - 'a'];
            }
            int rem = sum % 26;
            char result = (char) ('z' - rem);
            ans.append(result);
        }
        return ans.toString();
    }
}
