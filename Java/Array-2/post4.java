public int[] post4(int[] nums) {
  boolean flag = false;
  int lastIndex = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 4) lastIndex = i+1;
  }
  int[] res = new int[nums.length-lastIndex];
  for(int j = lastIndex,i=0; j < nums.length; j++,i++) {
    res[i] = nums[j];
  }
  return res;
}
