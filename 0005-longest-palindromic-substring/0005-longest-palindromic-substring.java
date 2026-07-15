class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            int odd = expandFromMiddle(s, i, i);
            int even = expandFromMiddle(s, i, i + 1);
            int max_length = Math.max(odd, even);

            if (max_length > (end - start)) {
                start = i - (max_length - 1) / 2;
                end = i + max_length / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandFromMiddle(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}