class Solution {
	public int singleNonDuplicate(int[] nums) {
		int n = nums.length;
		
		int left = 0;
		int right = n - 1;
		while(left < right){
			int mid = left + (right - left)/2; 

			if((mid & 1) == 0){ // mid is even, i.e. mid % 2 == 0
				// if mid is "good". find right range
				if(mid + 1 < n && nums[mid] == nums[mid + 1]){
					left = mid + 2;
				}else{
					// mid is bad, find left range
					right = mid; 
				}
			}else{ // mid is odd, i.e. mid % 2 == 1
			    // if mid is "good", find right range
				if(mid - 1 >= 0 && nums[mid] == nums[mid - 1]){
					left = mid + 1;
				}else{
				    // mid is "bad", find left range
					right = mid - 1; 
				}
			}
		}
		
		return nums[left];
	}
}
