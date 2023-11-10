public int[] zeroMax(int[] nums) {
  for(int i = 0; i < nums.length-1; i++) {
    if(nums[i] == 0) nums[i] = findMaxPostIndex(nums,i);
  }
  return nums;
}
public int findMaxPostIndex(int[] nums, int n) {
  int max = 0;
  for(int i = n + 1; i < nums.length; i++) {
    if(nums[i]%2 != 0 && nums[i] > max) max = nums[i];
  }
  return max;
}
