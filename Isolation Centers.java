/* package codechef; // don't place package name! */

import java.util.*;
Question at-->https://www.codechef.com/MAY20B/problems/CORUS
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String s[]=br.readLine().trim().split("\\s+");
		    int n=Integer.parseInt(s[0]);
		    int q=Integer.parseInt(s[1]);
		    String str=br.readLine();
		    int a[]=new int[26];
		    for(int i=0;i<str.length();i++)a[str.charAt(i)-97]++;
		    int cnt=0;
		    while(q-->0){
		        cnt=0;
		        int x=Integer.parseInt(br.readLine());
		        for(int i:a)if(i>x)cnt+=(i-x);
		        System.out.println(cnt);
		    }
		}
	}
}
