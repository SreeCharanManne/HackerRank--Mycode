public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        Integer[] nums = new Integer[A.size()]; 
        nums = A.toArray(nums); 
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
        int index = nums[start] - 1;
        if (index == start)
            start++;
        else if (index < 0 || index > end || nums[start] == nums[index])
            nums[start] = nums[end--];
        else {
            nums[start] = nums[index];
            nums[index] = index + 1;
        }
    }
    return start + 1;
    }
}
