static int equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */
         int sum1=sum(h1);
         int sum2=sum(h2);
         int sum3=sum(h3);
         int i=0,j=0,k=0;
while(!((sum1==sum2)&&(sum2==sum3)&&(sum1==sum3))){
            if(sum1>=sum2 && sum1>=sum3){
                sum1 -=h1[i];i++;
            }else if(sum2 >=sum1 && sum2>=sum3){
                sum2 -=h2[j];j++;
            }else{
                sum3 -=h3[k];k++;
            }
        }
        System.out.println(sum1);
return sum1;
    }
    static int sum(int h[])
    {int sum=0;
        for(int i=0;i<h.length;i++)
        sum+=h[i];
      return sum;  
    }
