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
