class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];int cnt=0;
        for(int i=1;i<nums.length;i++){
            prefix[i]+=prefix[i-1]+nums[i];
        }int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(i==0){
                    sum=prefix[j];
                }
                else{
                    sum=prefix[j]-prefix[i-1];
                }
                if(sum==k)cnt++;
            }
        }
        return cnt;
    }
}
