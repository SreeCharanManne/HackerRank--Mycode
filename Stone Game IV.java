class Solution {
    public boolean winnerSquareGame(int n) {
        if (n <= 1)return true;
      boolean[] hunter = new boolean[n + 1];
      hunter[0] = true;hunter[1] = true;hunter[2] = false;
      for (int i = 3; i <= n; i++)
      {for (int nf = 1; nf * nf <= i; nf++)
         {int k = nf * nf;
            if (i - k == 0 || !hunter[i - k])
            { hunter[i] = true;
               break;
            }}}

      return hunter[n] ? true: false;
    }
   
}
