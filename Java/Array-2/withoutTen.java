public int[] withoutTen(int[] nums) {
  int temp = 0;
  if(nums.length == 0) return nums;
  if(nums[0] == 10) {
    nums[0] = 0;
  }
  for(int i = 1; i < nums.length; i++) {
    if(nums[i] == 10) nums[i] = 0;
    if(nums[i-1] == 10) nums[i-1] = 0;
    if(nums[i] != 0 && nums[i-1] == 0) {
      nums[i-1] = nums[i];
      nums[i] = 0;
      i = 0;
    }
  }
  return nums;
}
