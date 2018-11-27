public class MyString implements CharSequence{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++){
      data[i] = charAt(i);
    }
  }
  public char charAt(int index){
    if (index < 0 || index > this.length()){
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }
  public String toString(){
    String str = "";
    for (int i = 0; i < this.length(); i++){
      str += charAt(i);
    }
    return str;
  }
  public CharSequence subSequence(int start, int end){
    String result = "";
    int len = data.length;s
    if (start < 0 || end < 0 || end > len || start > end){
       throw new IndexOutOfBoundsException();
     }
    for (int x = start; x < end; x ++) {
      result += charAt(x);
    }
    CharSequence sub = new MyString(result);
    return sub;
  }

  public int length() {
   return data.length;
 }

}
