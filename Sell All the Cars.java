Question at-->https://www.codechef.com/APRIL20B/problems/CARSELL

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Code1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		long n=in.nextLong();
		long a[]=new long[(int)n];
		for(int i=0;i<n;i++){a[i]=in.nextLong();}
		Arrays.sort(a);long s=0;long j=0;
		for(int i=a.length-1;i>=0;i--)
		{
		    if(a[i]-j>0){
                {s+=(a[i]-j);s=s%1000000007;}j++;
		    }
		}System.out.println(s);}
	}
}
