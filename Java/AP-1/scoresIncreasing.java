/*  Given an array of scores, return true if each score
    is equal or greater than the one before.
    The array will be length 2 or more.
*/
public boolean scoresIncreasing(int[] scores) {
  boolean flag = false;
  for(int i = 0; i < scores.length-1; i++) {
    if(scores[i+1]>=scores[i]) {
      flag = true;
    } else {
      return false;
      }
  } 
  return flag;
}
