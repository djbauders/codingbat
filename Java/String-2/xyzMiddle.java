/* Given a string, does "xyz" appear in the middle of the string?
  To define middle, we'll say that the number of chars to the left
  and right of the "xyz" must differ by at most one. 
  This problem is harder than it looks.
*/
public boolean xyzMiddle(String str) {
  if(str.length()<3) return false;
  int midR = str.length()/2-1;
  int midL = str.length()/2-2;

  if(str.length()%2 == 0) {
    return str.substring(midR,midR+3).equals("xyz") || str.substring(midL,midL+3).equals("xyz");
  }

  return str.substring(midR,midR+3).equals("xyz");
}
