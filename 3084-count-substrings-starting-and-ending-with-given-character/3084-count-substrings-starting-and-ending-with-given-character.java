class Solution {
  public long countSubstrings(String s, char c) {
    long count = 0;
    long answer = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        count++;
        answer += count;
      }
    }
    return answer;
  }
}