public boolean xyzThere(String str) {
  String x = "xyz";
  if(str.length() < 3) return false;
  if(str.substring(0,3).equals(x)) return true;
  for(int i = 1; i<str.length()-2;i++) {
    if(str.substring(i,i+3).equals(x) && str.charAt(i-1) != '.') return true;
  }
  return false;
}
