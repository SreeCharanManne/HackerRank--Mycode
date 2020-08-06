class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)  {
            int k = nums[i];
            if(k<0) {
                k = -k;
            }
            if(nums[k-1] < 0)
                list.add(k);
            else
                nums[k-1] = -nums[k-1];
        }
        return list;
    }
}
