public int[] tenRun(int[] nums) {
  boolean flag = false;
  int curr = 0;
  for(int i = 0; i < nums.length; i++) {
    if(flag && nums[i]%10 == 0) {
      curr = nums[i];
    } else if(!flag && nums[i]%10 == 0) {
      flag = true;
      curr = nums[i];
    }
    if(flag) nums[i] = curr;
  }
  return nums;
}
