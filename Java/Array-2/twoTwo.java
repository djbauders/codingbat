public boolean twoTwo(int[] nums) {
  if(nums.length < 1) return true;
  if(nums.length < 2) {
    for(int x : nums) {
      if(x == 2) return false;
    }
  }
  for(int i = 1; i < nums.length-1; i++) {
    if(nums[i] == 2 && (nums[i-1] != 2 && nums[i+1] !=2)) return false;
  }
  if(nums[nums.length-1] == 2 && nums[nums.length-2] !=2) return false;
  return true;
}
