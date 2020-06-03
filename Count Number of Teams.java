class Solution {
    public int numTeams(int[] rating) {
        int i = 0, j = 1, k = 2, l = rating.length;
        
        if (rating.length < 3) 
            return 0;
        
        int count = 0;
        
        while (i < l - 2) {
            if (rating[i] < rating[j] && rating[j] < rating[k])
                count++;
            
            if (rating[i] > rating[j] && rating[j] > rating[k])
                count++;
            
            if (k == (l - 1) && j == (l - 2)) {
                i++;
                j = i + 1;
                k = i + 2;
            } else if (k == (l - 1)) {
                j++;
                k = j + 1;
            } else  
                k++;
            }
        return count;
    }
}
