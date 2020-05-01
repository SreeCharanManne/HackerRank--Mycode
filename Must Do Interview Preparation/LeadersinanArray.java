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
		    int max=a[n-1];
		    StringBuffer str=new StringBuffer();
		    List<Integer>l=new ArrayList<>();
		    l.add(max);
		    for(int i=n-2;i>=0;i--){
		        if(max<=a[i]){max=a[i];
		        l.add(max);}
		    }
		     
		    for (int i =l.size()-1;i>=0; i--) { 
            str.append(l.get(i)+" ");
        } 
		    System.out.println(str);
		}
	}
}
