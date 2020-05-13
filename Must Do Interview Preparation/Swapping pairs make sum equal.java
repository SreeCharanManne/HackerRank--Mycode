

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0){
		    int n = in.nextInt();
		    int m = in.nextInt();
		    int sum1 = 0, sum2 = 0;
		    
		    int[] arr1 = new int[n];
		    int[] arr2 = new int[m];
		    
		    for(int i=0;i<n;i++){
		        arr1[i] = in.nextInt();
		        sum1+=arr1[i];
		    }
		    
		    for(int i=0;i<m;i++){
		        arr2[i] = in.nextInt();
		        sum2+=arr2[i];
		    }
		    
		    int l = 0 ,r = 0;
		    boolean found = false;
		    while(l<n && r<m){
		        int val1 = sum1-arr1[l]+arr2[r];
		        int val2 = sum2-arr2[r]+arr1[l];
		        
		        if(val1 == val2){
		            found = true;
		            System.out.println(1);
		            break;
		        }
		        l++;
		        r++;
		    }
		    
		    if(!found)
		    System.out.println(-1);
		}
	}
}
