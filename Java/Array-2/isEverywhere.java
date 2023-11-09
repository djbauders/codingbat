public boolean no14(int[] nums) {
  boolean flag1 = false, flag4 = false;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 1) flag1 = true;
    if(nums[i] == 4) flag4 = true;
    if(flag4 && flag1) return false;
  }
  return true;
}
