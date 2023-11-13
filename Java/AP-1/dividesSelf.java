/*  We'll say that a positive int divides itself if every
    digit in the number divides into the number evenly. So for
    example 128 divides itself since 1, 2, and 8 all divide
    into 128 evenly. We'll say that 0 does not divide into
    anything evenly, so no number with a 0 digit divides 
    itself. Note: use % to get the rightmost digit, and / 
    to discard the rightmost digit.
*/
public boolean dividesSelf(int n) {
  boolean flag = false;
  if(n%10 == 0) return false;
  int mult = 10, digiCount = 0, temp = n;
  while(temp != 0) {
    temp/=10;
    digiCount++;
  }
  for(int i = digiCount-1; i > 0; i--) {
      if((n/mult)%10 == 0 || n%(n%10) != 0) return false;
      if(n % ((n/mult)%10) == 0) {
        flag = true;
      } else {
        return false;
      }
      mult*=10;
  }
  return flag;
}
