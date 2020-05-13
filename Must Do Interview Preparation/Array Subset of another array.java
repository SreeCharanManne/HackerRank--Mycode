/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int m=in.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[m];
		    Set<Integer>s1=new HashSet<>();
		    for(int i=0;i<n;i++){a[i]=in.nextInt();s1.add(a[i]);}
		    //System.out.println(s1);
		    for(int i=0;i<m;i++){b[i]=in.nextInt();}int cnt=0;
		   for(int i:b){
		       if(s1.contains(i)){cnt++;}
		   }
		   if(cnt==m)System.out.println("Yes");
		   else System.out.println("No");
		}
	}
}
