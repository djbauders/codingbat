public int scoresAverage(int[] scores) {
  int max = average(scores,0,scores.length/2);
  int end = average(scores,scores.length/2,scores.length);
  if(end > max) max = end;
  return max;
}
public int average(int[] scores, int start, int end) {
  int count = 0;
  int avg = 0;
  for(int i = start; i < end; i++) {
    avg+=scores[i];
    count++;
  }
  avg/=count;
  return avg;
}
