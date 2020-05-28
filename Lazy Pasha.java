/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String s[]=br.readLine().trim().split("\\s+");
		    int n=Integer.parseInt(s[0]);
		    int q=Integer.parseInt(s[1]);
		    String str=br.readLine();
		    int s1=0;
            while(q-->0){
            String s11[]=br.readLine().trim().split("\\s+");
            int p1=Integer.parseInt(s11[0]);
            int p2=Integer.parseInt(s11[1])%n;

            if(p1==2)
            System.out.println(str.charAt((s1+p2)%n));
            else
            s1=(s1+n-p2)%n;
            }
		}
	}
	
}
