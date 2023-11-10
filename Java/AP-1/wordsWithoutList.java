public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> lst = new ArrayList<String>();
  for(int i = 0; i < words.length; i++) {
    if(words[i].length() != len) lst.add(words[i]);
  }
  return lst;
}
