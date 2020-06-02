/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
		    char arr[][]=new char[9][9];
		    for(int i=0;i<9;i++)
		    {
		        for(int j=0;j<9;j++)
		        {
		            arr[i][j]=sc.next().charAt(0);
		        }
		    }
		    
		   System.out.println(isValid(arr));
		  }
	}
	
	static int isValid(char[][] arr)
	{
	     HashSet<String> hs = new HashSet<String>();
		    
		    for(int i=0;i<9;i++)
		    {
		        for(int j=0;j<9;j++)
		        {
		            char current_val=arr[i][j];
		            if(current_val != '0')
		            {
		                if(!hs.add(current_val+ " found in row " + i) || !hs.add(current_val+ " found in colum "+ j)|| !hs.add(current_val + " found in sub box "+ i/3 + "-" + j/3))
	                        return 0;
		            }
		        }
		     }
		    return 1;
	}
}
