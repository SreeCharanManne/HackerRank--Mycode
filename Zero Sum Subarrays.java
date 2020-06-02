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
		    int n=Integer.parseInt(br.readLine());
		    long a[]=new long[n];
		    String s[]=br.readLine().trim().split("\\s+");
		    for(int i=0;i<n;i++)a[i]=Integer.parseInt(s[i]);
		    System.out.println(countZeroSubarray(a));
		}
	}
	static int countZeroSubarray(long[] arr) {
    HashMap<Long,Integer> map = new HashMap<>();
    int count = 0;
    Long sum = (long)0;
    map.put((long) 0, 1);
    for(int i = 0; i < arr.length; i++) {
        sum += arr[i];//System.out.println("sum :"+sum);
        if(map.containsKey(sum)) {
        int flag = map.get(sum);
        count += flag;
        map.put(sum, flag+1);
    } else {
            map.put(sum, 1);
        }
            }
    return count;
            }
}
