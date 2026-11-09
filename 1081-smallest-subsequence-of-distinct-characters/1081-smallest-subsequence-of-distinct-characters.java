class Solution {
    public String smallestSubsequence(String s) {
        int[] arr = new int[26];
        boolean[] b = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;
        }
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (b[c - 'a']) {
                continue;
            }

            while (st.length() > 0 && st.charAt(st.length() - 1) > c && arr[st.charAt(st.length() - 1) - 'a'] > i) {
                b[st.charAt(st.length() - 1) - 'a'] = false;
                st.deleteCharAt(st.length() - 1);
            }
            st.append(c);
            b[c - 'a'] = true;
        }
        return st.toString();
    }
}
