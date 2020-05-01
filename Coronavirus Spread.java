/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    String s[]=br.readLine().trim().split("\\s+");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)a[i]=Integer.parseInt(s[i]);
		    int min=9999,max=-9999;int dif=0,cnt=0;
		    List<Integer>l=new ArrayList<>();
		    for(int i=0;i<n-1;i++)
		    {
		        dif=Math.abs(a[i]-a[i+1]);
		        if(dif<=2)cnt++;
		        else {l.add(cnt+1);cnt=0;}
		    }l.add(cnt+1);
		        System.out.println(Collections.min(l)+" "+Collections.max(l));
		}
		
	}
}
Coronavirus Spread 
