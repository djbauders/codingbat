public int[] evenOdd(int[] nums) {
  int temp = 0;
  for(int i = 1; i < nums.length; i++) {
    if(nums[i]%2 == 0 && nums[i-1]%2 != 0) {
      temp = nums[i];
      nums[i] = nums[i-1];
      nums[i-1] = temp;
      i=0;
    }
  }
  return nums;
}
