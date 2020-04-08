Question at -->https://www.codechef.com/APRIL20B/problems/STRNO
import java.io.*; 
import java.lang.Math; 
import java.util.*;

class Code1 
{ 
	public static long pf(long n) 
	{ long cnt=0;
		while (n%2==0) 
		{ 
			cnt++; 
			n /= 2; 
		} 
		for (long i = 3; i <= Math.sqrt(n); i+= 2) 
		{ 
			while (n%i == 0) 
			{ 
				cnt++;
				n /= i; 
			} 
		} 
		if (n > 2) 
			cnt++; 
			return cnt;	
	} 

	public static void main (String[] args) 
	{ 
		Scanner in=new Scanner(System.in);
		long t=in.nextLong();
		while(t-->0)
		{
			long x=in.nextLong();
			long k=in.nextLong();
			//if(x==1  && k==1)System.out.println(1);System.exit(0);
			
			if(k<=pf(x))System.out.println(1);
			else{System.out.println(0);}
		}

	} 
} 
c
