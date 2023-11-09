public String parenBit(String str) {
  if(str.charAt(0) == '(') return "("+parenBit(str.substring(1));
  if(str.indexOf("(") == -1) {
    if(str.charAt(0) == ')') return ")";
    return str.charAt(0) + parenBit(str.substring(1));
  }
  return parenBit(str.substring(1));
}
