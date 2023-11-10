/*  Given an array of scores sorted in increasing order,
    return true if the array contains 3 adjacent scores 
    that differ from each other by at most 2, 
    such as with {3, 4, 5} or {3, 5, 5}.
*/
public boolean scoresClump(int[] scores) {
  for(int i = 1; i < scores.length-1;i++) {
    if(scores[i+1]-scores[i-1] <=2) return true;
  }
  return false;
}
