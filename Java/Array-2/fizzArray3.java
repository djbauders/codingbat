public int[] fizzArray3(int start, int end) {
  int len = end-start;
  int[] res = new int[len];
  for(int i = start,j=0; i < end; i++,j++) {
    res[j] = i;
  }
  return res;
}
