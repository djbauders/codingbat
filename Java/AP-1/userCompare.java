public int userCompare(String aName, int aId, String bName, int bId) {
  if(aName.compareTo(bName) > 0 || aId > bId) {
    return 1;
  }
    if(aName.compareTo(bName) < 0 || aId < bId) {
    return -1;
  }
  return 0;
}
