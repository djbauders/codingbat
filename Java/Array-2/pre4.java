public int[] pre4(int[] nums) {
  int len = 0;
  for(int j = 0; j < nums.length; j++) {
    if(nums[j] == 4) {
      len = j;
      break;
    }
  }
  int[] res = new int[len];
  for(int i = 0; i < len; i++) {
    res[i] = nums[i];
  }
  return res;
}
