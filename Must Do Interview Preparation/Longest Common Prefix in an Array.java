
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
    public static void findPrefix(String[] prefix)
    {
         String str = prefix[0];
         
         for(int i = 1 ;i < prefix.length ; i++)
         {
             String str2 = prefix[i];
             int j = 0;
             int min = Math.min(str.length() , str2.length());
             while(j<min)
             {
                 if(str.charAt(j)==str2.charAt(j))
                 {
                     j++;
                 }
                 else
                 {
                      break;
                 }
                
             }
             str = str.substring(0,j);
        }
       
        if(str.length()==0)
         System.out.println(-1);
         else
        System.out.println(str);
    }
    
     
	public static void main (String[] args) {
		//code
		 Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t>0)
        {
            t--;

            int n = obj.nextInt();
            String a[] = new String[n];
            for(int i = 0; i < n ;i++)
            {
                a[i] = obj.next();
            }
            
            findPrefix(a);
        }

	}
}
