public String front22(String str) {
  if(str.length() < 2) return str+str+str;
  String rts = str.substring(0,2);
  return rts + str + rts;
}
