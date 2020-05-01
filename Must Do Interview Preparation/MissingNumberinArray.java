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
		    int n=Integer.parseInt(br.readLine());
		    String s[]=br.readLine().trim().split("\\s+");
		    int a[]=new int[n];
		    int sum=0;
		    for(int i=0;i<n-1;i++){a[i]=Integer.parseInt(s[i]);sum+=a[i];}
		    int k=n*(n+1)/2;
		    System.out.println(k-sum);
		    
		}
	}
}
