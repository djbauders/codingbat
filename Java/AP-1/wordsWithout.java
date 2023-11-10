public String[] wordsWithout(String[] words, String target) {
  ArrayList<String> temp = new ArrayList<String>();
  for(int i = 0; i < words.length; i++) {
    if(words[i] != target) temp.add(words[i]);
  }
  String[] res = new String[temp.size()];
  res = temp.toArray(res);
  return res;
}
