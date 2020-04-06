import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int partition(int a[],int n)
     {
         int r=n-1;
         for(int i=n-1;i>=0;--i)
         {
             if(a[i]<=0)
             {
                 int temp=a[r];
                 a[r]=a[i];
                 a[i]=temp;
                 --r;
             }
         }
         return r;
     }
  public static int fn(int a[],int n)
  {
      int p=partition(a,n);
     
      for(int i=0;i<=p;++i)
      {
          if(Math.abs(a[i])-1<=p  && a[Math.abs(a[i])-1]>0)
          a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
      }

       for(int i=0;i<=p;++i)
      {
          if(a[i]>0)
          return i+1;
      }
      return p+2;
  }
 public static void main (String[] args)
  {
 Scanner ab=new Scanner(System.in);
 int t=ab.nextInt();
 while(t-->0)
 {
     int n=ab.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;++i)
     arr[i]=ab.nextInt();
     System.out.println(fn(arr,n));
 }
  }

}
