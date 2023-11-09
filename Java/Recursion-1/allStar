public String allStar(String str) {
  int len = str.length();
  if(len <= 1 || str.substring(len-2,len-1).equals("*")) return str;
  int index = str.lastIndexOf('*');
  if(index == -1) return allStar(str.substring(0,1) + "*" + str.substring(1,len));
  return allStar(str.substring(0,index+2) + '*'+ str.substring(index+2,len));
}
