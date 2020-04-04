class Solution {
    public String removeKdigits(String num, int k) {
        int digits = num.length() - k;
        if (num.length() <= k) return "0";
        int top = -1, start = 0;
        char[] st = num.toCharArray();
        for (int i = 0; i < st.length; i++) {
            while (top >= 0 && st[top] > st[i] && k > 0) {
                top--;
                k--;
            }
            st[++top] = st[i];
        }
        while (start <= top && st[start] == '0') start++;
        if (start > top) return "0";
        return new String(st, start, digits - start);
    }
}
