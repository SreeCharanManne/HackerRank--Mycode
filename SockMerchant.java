import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;


public class Solution {

public static void main(String arg[])
{Scanner in=new Scanner(System.in);
    long sum=0,sum1,sum2;
    long a[]=new long[5];
    for(int i=0;i<5;i++)
    {
        a[i]=in.nextLong();
    }
    for(int i=0;i<5;i++)
    {
        sum+=a[i];
    }
    for(int i=0;i<5;i++)
    {for(int j=i+1;j<5;j++){
        if(a[i]>a[j]){long t=a[i];a[i]=a[j];a[j]=t;}}
    }
    sum1=sum-a[4];sum2=sum-a[0];
    System.out.println(sum1+" "+sum2);
}


}
