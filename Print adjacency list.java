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
		    int v=Integer.parseInt(s[0]);
		    int e=Integer.parseInt(s[1]);
		    List<List<Integer>>a=new ArrayList<>();
		    for(int i=0;i<v;i++){
		            a.add(new ArrayList<Integer>());
		        }
		    while(e-->0){
		        String s1[]=br.readLine().trim().split("\\s+");
		        int x=Integer.parseInt(s1[0]);
		        int y=Integer.parseInt(s1[1]);
		        a.get(x).add(y);
		        a.get(y).add(x);
		    }
		    //System.out.println(a);
		    for(int i=0;i<a.size();i++){
		        System.out.print(i);
		        for(int j=0;j<a.get(i).size();j++){
		            System.out.print("-> "+a.get(i).get(j));
		        }System.out.println();
		    }
		}
	}
}
