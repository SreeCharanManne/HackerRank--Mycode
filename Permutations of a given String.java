/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	while(t-->0){
	    String s=br.readLine();
	    char tempArray[] = s.toCharArray(); 

        Arrays.sort(tempArray); 

        s= new String(tempArray); 
        permutation("",s);
        System.out.println();
	}
	}
	private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0)
          System.out.print(prefix + " ");
    else {
      for (int i = 0; i < n; i++)
        permutation(prefix + str.charAt(i), 
        str.substring(0, i) + str.substring(i + 1, n));
    }
}
}
