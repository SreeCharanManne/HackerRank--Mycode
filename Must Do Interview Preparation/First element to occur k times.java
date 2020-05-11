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
            String s[]=br.readLine().trim().split("\\s+");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            String s1[]=br.readLine().trim().split("\\s+");
            int a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=Integer.parseInt(s1[i]);
            Map<Integer,Integer>map=new TreeMap<>();
            for(int i:a)
            {
                if(map.containsKey(i))
                {
                    map.put(i,(int)map.get(i)+1);
                    
                }
                else
                    map.put(i,1);
            }
            boolean flag = true;
            for(int i:a){
                if(map.get(i)==k){System.out.println(i);
                flag=false;
                break;}
            }
            if(flag)System.out.println(-1);
	}
}}
