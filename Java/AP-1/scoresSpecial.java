public int scoresSpecial(int[] a, int[] b) {
  for(int i = 0; i < a.length; i++) if(a[i]%10 != 0) a[i] = 0;
  for(int j = 0; j < b.length; j++) if(b[j]%10 != 0) b[j] = 0;
  return sumSpecial(maxSpecial(a),maxSpecial(b));
}
public int maxSpecial(int[] x) {
  int xMax = 0;
  for(int i = 0; i < x.length; i++) {
    if(x[i] != 0 && x[i] > xMax) xMax = x[i];
  }
  return xMax;
}
public int sumSpecial(int a, int b) {
  return a+b;
}
