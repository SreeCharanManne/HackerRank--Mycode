import java.util.*;
class Facsum
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=factor(a[i]);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==b[j])System.out.println(a[i]);
            }
        }

        
    }
    static int factor(int n)
    {
        int sum=0;
        if(n==0)return Integer.MAX_VALUE;
        if(n==1)return 1;
        else
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }

}