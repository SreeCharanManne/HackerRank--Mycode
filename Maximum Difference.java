

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=in.nextInt();
		    int md=-9999;
		    int mt=a[0];
		    for(int i=0;i<n;i++)
		    {
		        md=Math.max(md,a[i]-mt);
		        mt=Math.min(a[i],mt);
		    }if(md>0)
		    System.out.println(md);
		    else System.out.println(-1);
		}
	}
}
