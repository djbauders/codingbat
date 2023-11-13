/*  Given a positive int n, return true if it contains
    a 1 digit. Note: use % to get the rightmost digit, and
    / to discard the rightmost digit.
*/

public boolean hasOne(int n) {
  int mult = 10;
  if(n%10 == 1) return true;
  int digiCount = 0,temp = n;
  while(temp != 0) {
    temp/=10;
    digiCount++;
  }
  for(int i = digiCount; i > 0; i--) {
      if((n/mult)%10 == 1) return true;
      mult*=10;
  }
  return false;
}
