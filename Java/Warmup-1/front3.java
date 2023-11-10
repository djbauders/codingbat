public String front3(String str) {
  if(str.length() < 3) return str+str+str;
  String dupe = str.substring(0,3);
  return dupe+dupe+dupe;
}
