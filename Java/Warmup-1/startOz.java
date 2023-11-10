public String startOz(String str) {
  if(str.length() < 2 && (str == "" || str == "o")) return str;
  String res = "";
  if(str.substring(0,1).equals("o")) res+= "o";
  if(str.substring(1,2).equals("z")) res+= "z";
  return res;
}
