public int[] zeroFront(int[] nums) {
  ArrayList<Integer> res = new ArrayList<Integer>();
  int zeroCount = 0;
  for (int x : nums) if(x == 0) zeroCount++;
  int[] nonZero = new int[nums.length-zeroCount];
  for(int i = 0; i < zeroCount; i++) {
    res.add(0);
  }
  for(int j = 0; j < nums.length; j++) {
    if(nums[j] != 0) {
      res.add(nums[j]);
    }
  }
  for(int k = 0; k < nums.length; k++) {
    nums[k] = res.get(k);
  }
  return nums;
}
