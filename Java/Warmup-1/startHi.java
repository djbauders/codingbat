public boolean startHi(String str) {
  if(str.length() <2) return false;
  if(str.substring(0,2).equals("hi")) return true;
  return false;
}
