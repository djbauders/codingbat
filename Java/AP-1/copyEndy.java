public int[] copyEndy(int[] nums, int count) {
  int[] res = new int[count];
  for(int i = 0, iter = 0; i < nums.length; i++) {
    if(isEndy(nums[i])) {
      res[iter] = nums[i];
      iter++;
      if(iter>=count) return res;
    }
  }
  return res;
}
public boolean isEndy(int n) {
  if((n>=0 && n<=10) || (n>=90 && n<=100)) return true;
  return false;
}
