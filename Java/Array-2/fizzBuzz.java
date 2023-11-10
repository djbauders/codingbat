public String[] fizzBuzz(int start, int end) {
  String[] res = new String[end-start];
  for(int i = start,j=0; i < end; i++,j++) {
    res[j] = "";
    if(i%3 == 0) res[j]+="Fizz";
    if(i%5 == 0) res[j]+="Buzz";
    if(i%3 != 0 && i%5 != 0) res[j]=String.valueOf(i);
  }
  return res;
}
