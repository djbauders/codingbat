public int commonTwo(String[] a, String[] b) {
  int count =0;
  String ans = "";
  for (int i = 0; i < a.length; i++)
    for (int j = 0; j<b.length; j++)
    if (a[i] == b[j] && a[i] != ans){
      ans = b[j];
      count++;
      break;
    }
  return count;
}
