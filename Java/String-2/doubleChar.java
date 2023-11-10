public String doubleChar(String str) {
  String res = "";
  for(int i = 0; i < str.length();i++) {
    res+=str.substring(i,i+1);
    res+=str.substring(i,i+1);
  }
  return res;
}
