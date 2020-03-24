class Solution {
   
         public int countBattleships(char[][] b) {
        if (b == null || b.length == 0 || b[0] == null || b[0].length == 0)
            return 0;
        int k = 0; 

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (b[i][j] == 'X') {
                    if ((i > 0 && b[i - 1][j] == 'X')||(j > 0 && b[i][j - 1] == 'X'))
                        continue;
                    k++;
                }
            }
        }
        
         return k;
    }
    
}
