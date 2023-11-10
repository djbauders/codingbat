public boolean xyBalance(String str) {
  boolean balance = true;
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'x') balance = false;
    if(str.charAt(i) == 'y') balance = true;
  }
  return balance;
}
