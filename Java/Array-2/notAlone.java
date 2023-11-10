public int[] notAlone(int[] nums, int val) {
  int max = 0;
  for (int i = 1; i < nums.length-1; i++) {
    if(nums[i] == val && (nums[i-1] != val  && nums[i+1] != val)) {
      max = nums[i-1];
      if(max<nums[i+1]) {
        max = nums[i+1];
      }
    nums[i] = max;
    }
  }
  return nums;
}
