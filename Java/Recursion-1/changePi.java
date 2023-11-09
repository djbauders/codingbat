public String changePi(String str) {
  int index = str.indexOf("pi");
  if(index == -1) return str;
  return changePi(str.substring(0,index) + "3.14" + str.substring(index+2));
}
