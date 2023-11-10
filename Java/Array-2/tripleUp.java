public boolean tripleUp(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length-1; i++) {
    if(nums[i]+1 == nums[i+1])  {
      count++;
    } else {
      count = 0;
    }
    if(count >= 2) return true;
  }
  return false;
}
