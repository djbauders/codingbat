public String repeatSeparator(String word, String sep, int count) {
  String bigStr = "";
  while(count>0) {
    if(count==1) {
      bigStr+=word;
    } else {
      bigStr+=word+sep;
    }
    count--;
  }
  return bigStr;
}
