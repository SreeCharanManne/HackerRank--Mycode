//   package rishabh;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc=new FastReader();
// 		constructST(a,n);RMQ(n, qs, qe)
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),m=sc.nextInt();
            int a[][]=new int[n][m],max=0,count=0,index=0;
            
            for(int i=0; i<n ;i++){
                count=0;
                for(int j=0; j<m; j++){
                    a[i][j]=sc.nextInt();
                    if(a[i][j]==1)
                        count++;
                }
                if(count>max) {index=i; max=count;}
            }
            System.out.println(index);
		}
	}
	static int lower_bound(int a[],int x){
         int n=a.length,low=0,high=n-1,res=-1;
         while(low<=high){
             int mid=(low+high)>>1;
             if(a[mid]>=x){
                res=mid;high=mid-1;
             }
             else 
                low=mid+1;
         }
         return res;
     }
     static int upper_bound(int a[],int x){
          int n=a.length,low=0,high=n-1,res=-1;
          while(low<=high){
              int mid=(low+high)>>1;
              if(a[mid]<=x){
                  res=mid;low=mid+1;
              }
              else 
                  high=mid-1;
          }
          return res;
     }
    //   static int MAX=1000001;boolean prime[] = new boolean[MAX]; 
      
    //   static void sieveOfEratosthenes() { 
    //       for(int m9=0;m9<MAX;m9++) prime[m9]=true;
    //     for(int p = 2; p*p <=n; p++) { 
    //         if(prime[p] == true) 
    //         { 
    //             // Update all multiples of p 
    //             for(int i = p*2; i <= n; i += p) 
    //                 prime[i] = false; 
    //         } 
    //     } 
    //   }
      
     static long modexpo(long x,long n,long m){
        if(n==0)
            return 1;
        else if(n%2==0)
            return (modexpo(((x%m)*(x%m))%m,n/2,m))%m;
        else
            return ((x%m)*((modexpo(((x%m)*(x%m))%m,(n-1)/2,m))%m))%m;
     } 
     static int gcd(int a,int b){
           if(b==0)
              return a;
           else 
              return gcd(b,a%b);
     }
     static long gcd(long a,long b){
           if(b==0)
              return a;
           else 
              return gcd(b,a%b);
     }
	 static class FastReader{
          BufferedReader in;
          StringTokenizer st;
          public FastReader(){
              in=new BufferedReader(new InputStreamReader(System.in));
          }
          String next(){
              while(st==null || !st.hasMoreElements()){
                  try{
                      st=new StringTokenizer(in.readLine());
                  }
                  catch(IOException e){
                      e.printStackTrace();
                  }
               }
               return st.nextToken();
            }
            int nextInt(){
                return Integer.parseInt(next());
            }
            long nextLong(){
                return Long.parseLong(next());
            }
            double nextDouble(){
                return Double.parseDouble(next());
            }
            String nextLine(){
            String str19 = "";
            try{
                str19 = in.readLine();
            }
            catch (IOException e){ 
                e.printStackTrace();
             }
            return str19;
        }
     }    
}
