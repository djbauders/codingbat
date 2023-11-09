public int sum13(int[] nums) {
  int sum = 0,count = 0;
  boolean flag = false;
  if(nums.length == 0) {
    return 0;
  }
  for(int i = 0; i < nums.length; i++) {
    if(flag) {
      flag = false;
    } else if(nums[i] == 13) {
      flag = true;
    } else {
      sum+=nums[i];
    }
  }
  return sum;
}
