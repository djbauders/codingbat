public boolean modThree(int[] nums) {
  boolean oddFlag = false, evenFlag = false;
  int oddCount = 0, evenCount = 0;
  for (int i = 0; i < nums.length; i++) {
    if(oddCount >=3 || evenCount >=3) return true;
    if(nums[i]%2 == 0) {
      evenFlag = true;
      if(oddFlag) {
        oddFlag = false;
        oddCount = 0;
      }
    } else {
      oddFlag = true;
      if(evenFlag) {
        evenFlag = false;
        evenCount = 0;
      }
    }
    if(evenFlag) evenCount++;
    if(oddFlag) oddCount++;
    }
  if(oddCount >= 3 || evenCount >= 3) return true;
  return false;
}
