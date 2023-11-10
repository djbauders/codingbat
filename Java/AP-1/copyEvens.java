public int[] copyEvens(int[] nums, int count) {
  int[] res = new int[count];
  //int iter = 0;
  for(int i = 0,iter = 0; i < nums.length; i++) {
    if(nums[i]%2 == 0) {
      res[iter] = nums[i];
      iter++;
      if(iter>=count) return res;
    }
  }
  return res;
}
