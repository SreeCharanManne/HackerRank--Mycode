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
		    int n=Integer.parseInt(br.readLine());
		    String s[]=br.readLine().trim().split("\\s+");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=Integer.parseInt(s[i]);
		    }int sum=0;
		    int presum[]=new int[n];
		    for(int i=0;i<n;i++){sum+=a[i];presum[i]=sum;}
		    int sum1=0,ans=-1;
		     for(int i=n-1; i>=0; i--){
            sum1+=a[i];
            if(sum1==presum[i])ans=i+1;
        }if(ans==0){
            System.out.println(0);
        }
        System.out.println(ans);
	   }
	}
	
}
