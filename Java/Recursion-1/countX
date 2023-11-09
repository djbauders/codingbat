public int countX(String str) {
  int inc = 0;
  if(str.length() == 1 && str.substring(0,1).equals("x")) return 1;
  if(str.length()<2) return 0;
  if(str.substring(0,1).equals("x")) inc = 1;
  str=str.substring(1,str.length());
  return inc+countX(str);
}
