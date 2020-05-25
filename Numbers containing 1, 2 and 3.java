/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
    
	public static void main (String[] args) {
		Scanner sc=  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n  = sc.nextInt();
		    int a[] =new int[n];
		    
		    for(int i =0;i<n;i++)
		    a[i] = sc.nextInt();
		    
		    ArrayList<Integer> a1= new ArrayList<Integer>();
		    
		    
		    for(int i =0;i<n;i++)
		    {
		        if(check(a[i]))
		        a1.add(a[i]);
		    }
		    Collections.sort(a1);
		    if(a1.size()!=0)
		    {
		        for(int t12 : a1)
		        System.out.print(t12+" ");
		    }
		    else
		    System.out.print(-1);
		    
		    
		    System.out.println();
		    
	}
	
}
public static boolean check(int k )
{
    HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		    m.put('1',1);
		    m.put('2',1);
		    m.put('3',1);
		    
		   String S = String.valueOf(k);
		   
		   for(int i =0;i<S.length();i++)
		   {
		       if(!m.containsKey(S.charAt(i))) return false;
		   }
		    
		    return true;
		    
}



}
