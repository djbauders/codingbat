public boolean hasTeen(int a, int b, int c) {
  int[] lst = {a,b,c};
  for(int i : lst) {
    if((i>12) && (i<20)) return true;
  }
  return false;
}
