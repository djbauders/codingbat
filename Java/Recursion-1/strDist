public int strDist(String str, String sub) {
  //3 line non-recursive
  //if(str.length()<sub.length()) return 0;
  //if(str.indexOf(sub)==-1) return 0;
  //return str.substring(str.indexOf(sub),str.lastIndexOf(sub)+sub.length()).length();
  
  //Recursive solution
  if(str.length() < sub.length()) return 0;
  if(str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length()).equals(sub)) {
    return str.length();
  }
  if(!str.substring(0,sub.length()).equals(sub)) {
    return strDist(str.substring(1),sub);
  }
  return strDist(str.substring(0,str.length()-1),sub);
}
