/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
		    String pattern = "1";
		    if(n == 1){
		        System.out.println(pattern);
		        continue;
		    }
		    for(int i=1;i<n;i++){
		        int count = 1; String next = "";
		        for(int j=0;j<pattern.length();j++){
		            if(j+1 < pattern.length()){
		                if(pattern.charAt(j) == pattern.charAt(j+1)){
		                    count++;
		                }else{
		                    next += String.valueOf(count) + pattern.charAt(j);
		                    count = 1;
		                }
		            }else{
		                next += String.valueOf(count) + pattern.charAt(j);
		            }
		        }
		        pattern = next;
		    }
		    System.out.println(pattern);
		}
	}
}
