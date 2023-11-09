public String changeXY(String str) {
  int index = str.indexOf("x");
  if(index == -1) return str;
  return changeXY(str.substring(0,index) + 'y' + str.substring(index+1));
}
