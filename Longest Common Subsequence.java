/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws Exception {
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String sk[]=br.readLine().split("\\s+");
		    String s=br.readLine();String s1=br.readLine();
		    int m=s.length();int n=s1.length();
		    int dp[][]=new int[m+1][n+1];
		    for(int i=0;i<=m;i++){
		        for(int j=0;j<=n;j++){
		            if(i==0||j==0){dp[i][j]=0;}
		            else if(s.charAt(i-1)==s1.charAt(j-1)){dp[i][j]=dp[i-1][j-1]+1;}
		            else {
		                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		            }
		        }
		       
		    } System.out.println(dp[m][n]);
		}
	}
}
