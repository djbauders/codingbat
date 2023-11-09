public int array11(int[] nums, int index) {
  if(nums.length == 0) return 0;
  if(nums[index] == 11 && index == nums.length-1) return 1;
  if(nums[index] == 11) return 1+array11(nums,index+1);
  if(index==nums.length-1) return 0;
  return array11(nums,index+1);
}
