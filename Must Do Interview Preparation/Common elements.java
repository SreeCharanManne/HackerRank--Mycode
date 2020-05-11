/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Code1 {
    public static void main (String[] args) throws Exception
    {		//code
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s[]=br.readLine().trim().split("\\s+");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            int q=Integer.parseInt(s[2]);
            String s1[]=br.readLine().trim().split("\\s+");
            String s2[]=br.readLine().trim().split("\\s+");
            String s3[]=br.readLine().trim().split("\\s+");
            int a[]=new int[n];for(int i=0;i<n;i++)a[i]=Integer.parseInt(s1[i]);
            int b[]=new int[m];for(int i=0;i<m;i++)b[i]=Integer.parseInt(s2[i]);
            int c[]=new int[q];for(int i=0;i<q;i++)c[i]=Integer.parseInt(s3[i]);
            Map<Integer,Integer>map=new TreeMap<>();
            for(int i:a)
            {
                    map.put(i,1);
            }
            for(int i:b)
            {
                if(map.containsKey(i))
                {
                    if(map.get(i)==1)
                    map.put(i,2);
                }
            }
            for(int i:c)
            {
                if(map.containsKey(i))
                {
                    if(map.get(i)==2)
                    map.put(i,3);
                }
            }
            String str="";
            for(Map.Entry mf: map.entrySet()){
                if((int)mf.getValue()==3){
                    str+=(mf.getKey()+" ");
                }
            }
            if(str.length()==0)System.out.println(-1);
            else
            System.out.println(str);
        }
	}
}
