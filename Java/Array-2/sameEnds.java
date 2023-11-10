public boolean sameEnds(int[] nums, int len) {
  boolean flag = true;
  int[] front = new int[len];
  int[] end = new int[len];
  for(int i = 0,j=nums.length-len; i < len; i++,j++) {
    front[i] = nums[i];
    end[i] = nums[j];
    if(front[i] != end[i]) flag = false;
  }
  return flag;
}
