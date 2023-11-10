public int[] shiftLeft(int[] nums) {
  int temp = 0;
  if(nums.length < 1) return nums;
  for(int i = 0; i < nums.length-1; i++) {
    temp = nums[i];
    nums[i] = nums[i+1];
    nums[i+1] = temp;
  }
  return nums;
}
