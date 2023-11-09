public int centeredAverage(int[] nums) {
  Arrays.sort(nums);
  int avg = 0, count = 0, sum = 0;
  int[] arr = new int[nums.length-2];
  for(int i = 1,j=0; i < nums.length-1; i++) {
    arr[j] = nums[i];
    j++;
  }
  for(int i = 0; i < arr.length; i++) {
    sum+=arr[i];
    count++;
  }
  avg = sum/count;
  return avg;
}
