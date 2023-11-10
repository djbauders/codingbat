public int bigHeights(int[] heights, int start, int end) {
  int count = 0, big = 5;
  for(int i = start; i < end; i++) {
    if(Math.abs(heights[i]-heights[i+1]) >= big) count++;
  }
  return count;
}
