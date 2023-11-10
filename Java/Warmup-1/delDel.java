public String delDel(String str) {
  if(str.length() > 3 && str.substring(1,4).equals("del")){
    String a = str.substring(0,1);
    String b = str.substring(4,str.length());
    return a+b;
  }
  return str;
}
