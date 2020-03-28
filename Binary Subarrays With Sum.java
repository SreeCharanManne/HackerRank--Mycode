class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int[] preSum = new int[A.length + 1];
        
        for(int i = 0; i < A.length; i++) {
            preSum[i + 1] = preSum[i] + A[i];
        }
        
        int res = 0;
        for(int i = 1; i <= A.length; i++) {
            for(int j = 0; j < i; j++) {
                if(preSum[i] - preSum[j] == S) res++;
            }
        }
        return res;
    }
}
