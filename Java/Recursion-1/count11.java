public int count11(String str) {
  int index = str.indexOf("11");
  if(index == -1) return 0;
  if(index == 0 && str.charAt(index) == str.charAt(index+1)) {
    return 1+count11(str.substring(2));
  }
  if(str.charAt(index) == str.charAt(index+1) && index!=0) {
    return 1+count11(str.substring(0,index) + str.substring(index+2));
  }
  return count11(str.substring(1));
}
