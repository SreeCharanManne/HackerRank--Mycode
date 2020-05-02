/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String s=br.readLine();
		    System.out.println(dps(s.toCharArray(),s.length()));
	}}
	public static int dps(char str[], int n) 
    { 
        int dp[][] = new int[n][n]; 
        int l, h, g; 

        for (g = 1; g < n; ++g) 
        for (l = 0, h = g; h < n; ++l, ++h) 
            dp[l][h] = (str[l] == str[h])? 
                           dp[l+1][h-1] : 
                          (Integer.min(dp[l][h-1], 
                                 dp[l+1][h]) + 1); 
        return dp[0][n-1]; 
    } 
}
