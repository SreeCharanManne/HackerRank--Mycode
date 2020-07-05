class Solution {
    private int cal(int[] data) {
        int n = data.length;
        
        int ret = 0;
        int now = 0;
        for (int i = 0;i < data.length;i++) {
            if (data[i] != 0) {
                ret += now * (now + 1) / 2;
                now = 0;
            } else {
                now++;
            }
        }
        ret += now * (now + 1) / 2;
        return ret;
    }
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] data = new int[m];
        int ret = 0;
        for (int i = 0;i < n;i++) {
            Arrays.fill(data, 0);
            for (int j = i;j < n;j++) {
                for (int k = 0;k < m;k++) {
                    data[k] += mat[j][k] ^ 1;
                }
                ret += cal(data);
            }
        }
        return ret;
    }
}
