public String[] mergeTwo(String[] a, String[] b, int n) {
  int len = a.length+b.length;
  String[] res = new String[len];
  for(int i = 0; i < a.length; i++) res[i] = a[i];      //Merge both str arr
  for(int j = a.length-1, m = 0; j < len && m < b.length; j++) {
    res[j] = b[m];
    m++;
  }
  res = removeDuplicates(res);
  res = sortArr(res);
  res = removeIndexes(res,n);
  return res;
}
public String[] sortArr(String[] arr) {
  String temp = "";
  for(int i = 0; i < arr.length-1; i++) {
    if(arr[i].compareTo(arr[i+1]) > 0) {
      temp = arr[i];
      arr[i] = arr[i+1];
      arr[i+1] = temp;
      i = -1;
    }
  }
  return arr;
}
public String[] removeDuplicates(String[] arr) {
  ArrayList<String> res = new ArrayList<String>();
  boolean flag = false;
  for(int i = 0; i < arr.length-1; i++) {
    for(int j = i+1; j < arr.length; j++) {
      if(arr[i]==arr[j]) flag = true;
    }
    if(flag) {
      flag = false;
      continue;
    }
    res.add(arr[i]);
  }
  
  String[] fin = new String[res.size()];
  fin = res.toArray(fin);
  return fin;
}
public String[] removeIndexes(String[] arr, int index) {
  String[] res = new String[index];
  for(int i = 0; i < index; i++) {
    res[i] = arr[i];
  }
  return res;
}
public String[] tryToRemoveIndex(String[] arr, int index) {
  String[] res = new String[arr.length-1];
  for(int i = 0,k = 0; i < arr.length; i++) {
    if(i == index) {
      continue;
    }
    res[k++] = arr[i];
  }
  return res;
}
