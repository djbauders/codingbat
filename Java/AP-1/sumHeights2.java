public int sumHeights2(int[] heights, int start, int end) {
  int sum = 0, cur = 0;
  for(int i = start; i < end; i++) {
    if(heights[i] - heights[i+1] > 0) {
      cur = Math.abs(heights[i]-heights[i+1]);
    } else {
      cur = Math.abs(heights[i]-heights[i+1])*2;
    }
    sum+=cur;
  }
  return sum;
}
