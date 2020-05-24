static int countSumSubsets(int arr[],int n)
    {
        int cnt=0;
    for(int i=1;i<Math.pow(2,n);i++)
    {
        int sum=0;
        for(int j=0;j<n;j++)
        {
            if((i&(1<<j))!=0)
            sum=sum+arr[j];
        }
        if(sum%2==0)
        cnt++;
    }
    return cnt;
    }
