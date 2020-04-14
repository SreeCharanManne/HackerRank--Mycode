Question at-->https://www.codechef.com/CY302020/problems/CODEY302

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static int cnt(char digits[], int n){
    int count[] = new int[n + 1];  
    count[0] = 1; 
    count[1] = 1; 
    if(digits[0]=='0')  
          return 0; 
    for (int i = 2; i <= n; i++) 
    { 
        count[i] = 0; 
        if (digits[i - 1] > '0') 
            count[i] = count[i - 1];
        if (digits[i - 2] == '1' || 
           (digits[i - 2] == '2' &&  
            digits[i - 1] < '7')) 
            count[i] += count[i - 2]; 
    } 
    return count[n]; 
} 
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    String str = s.next();
		    char[] ch = str.toCharArray();
		    int n = ch.length; 
            if(cnt(ch, n)%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
		    
		}
	}
}
