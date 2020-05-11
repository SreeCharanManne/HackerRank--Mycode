/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
		    int a[]=new int[n1];
		    int b[]=new int[n2];
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<n1;i++){
		    a[i]=sc.nextInt();
		    if(map.containsKey(a[i]))
		    map.put(a[i],map.get(a[i])+1);
		    else
		    map.put(a[i],1);
		    }
		    for(int i=0;i<n2;i++)
		    b[i]=sc.nextInt();
		    int out[]=new int[n1];
		    int res=0;
		    for(int i=0;i<n2;i++)
		    {
		        if(map.containsKey(b[i]))
		        {
		            int count=map.get(b[i]);
		            for(int k=0;k<count;k++)
		            out[res+k]=b[i];
		            
		            res+=count;
		            map.remove(b[i]);
		        }
		    }
		    ArrayList<Integer> al=new ArrayList<>(map.keySet());
		    Collections.sort(al);
		    for(int i : al)
		    {
		        int k=map.get(i);
		        for(int p=0;p<k;p++)
		        out[res++]=i;
		    }
		   for(int i=0;i<n1;i++)
		   System.out.print(out[i]+" ");
		   System.out.println();
		   
		}
	
	}
}
