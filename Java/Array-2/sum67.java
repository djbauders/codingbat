public int sum67(int[] nums) {
  boolean flag = false;
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    if(!flag && nums[i] == 6) {
      flag = true;
    } else if(!flag) {
      sum+=nums[i];
    } else if(flag && nums[i] == 7) {
      flag = false;
    }
  }
  return sum;
}
