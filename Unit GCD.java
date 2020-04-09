Question at-->https://www.codechef.com/APRIL20B/problems/UNITGCD

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Code1
{
	public static void main (String[] args) throws Exception
	{
		// your code goes here
		BufferedOutputStream out = new BufferedOutputStream ( System.out );
		BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
        int t=0;
        t = Integer.parseInt(br.readLine()); 
		while(t-->0)
		{
		   
			int n = Integer.parseInt(br.readLine()); 
			int cnt=n/2;
			int k=0;
			if(n==1){System.out.println(1);System.out.println("1 1");}

			else if(n%2==0)
			{
			System.out.println(cnt);
			System.out.println(2+" "+1+" "+2);
			}
			
		    else{
			System.out.println(cnt);
			System.out.println(3+" "+1+" "+2+" "+n);
		    }
		k=3;
		for(int i=1;i<cnt;i++)
		    {
			out.write((2+" "+(k)+" "+(k+1)).getBytes());
			out.write(("\n").getBytes());
			k=k+2;
		    }
		out.flush();
	    }
	}
}
