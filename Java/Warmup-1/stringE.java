public boolean stringE(String str) {
  int c = 0;
  for (int i = 0; i < str.length(); i++) {
    if(str.substring(i,i+1).equals("e")) c++;
  }
  if(c>0 && c<4) return true;
  return false;
}
