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
		    for(int i=0;i<n;i++)a[i]=Integer.parseInt(s[i]);
		    arrange(a);
		    System.out.println();
		}
	}
	public static void arrange(int a[]){
	    int i=0,j=a.length-1;
	    int t[]=new int[a.length];
	    int k=1;
	    for(int h=0;h<a.length;h++){
	        if(k==1){
	            t[h]=a[j--];
	        }
	        else{
	            t[h]=a[i++];
	        }
	        if(k==1){k=0;}
	        else{k=1;}
	        
	    }a = t.clone(); 
	    for(int h=0;h<a.length;h++)System.out.print(a[h]+" ");
	    
	}
}
