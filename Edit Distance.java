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
		    String s[]=br.readLine().trim().split("\\s+");
		    String str[]=br.readLine().trim().split("\\s+");
		    int l1=Integer.parseInt(s[0]);
		    int l2=Integer.parseInt(s[1]);
		    String s1=str[0],s2=str[1];
		    int[][] dp = new int[l1+1][l2+1];
		    
		    for(int i=0; i<(l2+1); i++){
		        dp[0][i] = i;
		    }
		    
		    for(int i=0; i<(l1+1); i++){
		        dp[i][0] = i;
		    }
		    
		    for(int i=1; i<(l1+1); i++){
		        for(int j=1; j<(l2+1); j++){
		            if(s1.charAt(i-1) == s2.charAt(j-1)){
		                dp[i][j] = dp[i-1][j-1];
		            }
		            else{
		                dp[i][j] = 1 + (int)(Math.min(Math.min(dp[i-1][j],dp[i][j-1]), dp[i-1][j-1]));
		            }        
		        }
		    }
		    System.out.println(dp[l1][l2]);
		}
		
	}
}
