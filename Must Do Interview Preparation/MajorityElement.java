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
		    }
		    int cnt=0,can=0;
		    for(int i:a){
		        if(cnt==0)can=i;
		        cnt += (i == can) ? 1 : -1;
		    }cnt=0;
		    for(int i:a){
		        if(i==can)cnt++;
		    }
		    if(cnt>n/2)
		    System.out.println(can);
		    else{System.out.println(-1);}
		    
		}
	}
}
