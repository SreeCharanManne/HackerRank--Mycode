import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-- > 0){
	        int n = scan.nextInt();
	        int m = scan.nextInt();
	        String str1 = scan.next();
	        String str2 = scan.next();
	        int ans = lcsCount(str1,str2,n,m);
	        System.out.println(ans);
	    }
	}
	static int lcsCount(String s1,String s2,int n,int m){
	    int result = 0;
	    int memo[][] = new int[n+1][m+1];
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=m;j++){
	            if(i==0 || j==0)
	                memo[i][j] = 0;
	            else if(s1.charAt(i-1) == s2.charAt(j-1)){
	                memo[i][j] = memo[i-1][j-1]+1;
	                if(result<memo[i][j])
	                    result = memo[i][j];
	            }else
	                memo[i][j] = 0;
	        }
	    }
	    return result; 
	} 
}
