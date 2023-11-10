public boolean has12(int[] nums) {
  boolean flag1 = false, flag2 = false;
  for(int i = 0; i < nums.length; i++) {
    if(!flag1 && nums[i] == 1) flag1 = true;
    if(flag1 && nums[i] == 2) flag2 = true;
  }
  if(flag1 && flag2) return true;
  return false;
}
