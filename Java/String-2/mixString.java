public String mixString(String a, String b) {
  String res = "";
  int maxLen = a.length();
  if(b.length()>maxLen) maxLen = b.length();
  for(int i = 0; i < maxLen; i++) {
    if(i<a.length()) {
      res+=a.charAt(i);
    }
    if(i<b.length()) {
      res+=b.charAt(i);
    }
  }
  return res;
}
