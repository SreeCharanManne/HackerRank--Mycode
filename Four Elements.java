//O(n2)
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 class Pair{
     int i;
     int j;

     Pair(int x,int y){
         i=x;
         j=y;
     }
 }
class GFG
 {
     public static boolean get4Numbers(int a[],int sum)
    {
    int len=a.length;
    Map<Integer, Pair> sums = new HashMap<Integer, Pair>(); 
    for (int i = 0; i < len; ++i) {
        // 'sums' hastable holds all possible sums a[k] + a[l]
        // where k and l are both less than i

        for (int j = i + 1; j < len; ++j) {
            int current = a[i] + a[j];
            int rest = sum - current;
            // Now we need to find if there're different numbers k and l
            // such that a[k] + a[l] == rest and k < i and l < i
            // but we have 'sums' hashtable prepared for that
            if (sums.containsKey(rest)) {
                // found it
                return true;
                /*
                
                Pair p = sums.get(rest);
                System.out.println(a[i]+" + "+a[j]+" + "+a[p.i] +" + "+a[p.j]+" = "+sum);
                */

            }
        }

        // now let's put in 'sums' hashtable all possible sums
        // a[i] + a[k] where k < i
        for (int k = 0; k < i; ++k) {
            sums.put(a[i] + a[k],new Pair(i, k));
        }
    }
    return false;
 }
     
     
	public static void main(String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    for(int z = 0 ; z < testCases;z++)
	    {
	       int size = sc.nextInt();
	       int ar[] = new int[size];
	       for(int i=0;i<size;i++)
	       {
	           ar[i] =sc.nextInt();
	       }
	       int sum = sc.nextInt();
	       System.out.println(get4Numbers( ar,sum)==true?1:0);
	    }
	 }
}
