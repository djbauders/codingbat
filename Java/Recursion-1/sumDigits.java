public int sumDigits(int n) {
  if(n/10==0) return n;
  return (n%10) + sumDigits(n/10);
}
