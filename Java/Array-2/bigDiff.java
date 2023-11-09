public int bigDiff(int[] nums) {
  int max = nums[0], min = nums[0];
  for(int i = 0; i<nums.length-1;i++) {
    if(nums[i+1] > max) max=nums[i+1];
    if(nums[i+1] < min) min=nums[i+1];
  }
  return Math.abs(max-min);
}
