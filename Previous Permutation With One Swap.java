class Solution {
   public int[] prevPermOpt1(int[] A) {
        int i,j;
        for(i = A.length-2;i>=0;i--) {
            if(A[i] > A[i+1]) break;
        }
        
        if(i == -1) return A;
        
        for(j = A.length-1;j>i;j--) {
            if(A[j] < A[i]) break;
        }
        
        while(j>i && A[j-1] == A[j]) j--;
        
        int tmp = A[j];
        A[j] = A[i];
        A[i] = tmp;

        return A;
    }
}
