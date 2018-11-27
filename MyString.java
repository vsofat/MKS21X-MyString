public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int index = 0; index < s.length(); index++){
      data[index] = charAt(index);
    }
  }
  public char charAt(int index){
    if (index < 0 || index > this.length()){
      throw new IndexOutOfBoundsException("Index was out of bounds: index was less than 0 or greater than the length of the CharSequence.");
    }
    return data[index];
  }
  public String toString(){
    String str = "";
    for (int index = 0; index < this.length(); index++){
      str += charAt(index);
    }
    return str;
  }
  public CharSequence subSequence(int start, int end){
    String result = "";
    int len = data.length;
    if (start < 0 || end < 0 || end > len || start > end){
       throw new IndexOutOfBoundsException("Index was out of bounds: the start value was less than 0, the end value was less than 0, the end value was greater than the length of the sequence or the start value was greater than the end value.");
     }
    for (int x = start; x < end; x ++) {
      result += charAt(x);
    }
    return new MyString(result);
  }
  public int length() {
   return data.length;
 }
 public int compareTo(CharSequence seq) {
    if (seq == null) {
      throw new NullPointerException("The value of a was null.");
    }
    else {
      int result = 0;
      for (int index = 0; index < Math.min(this.length(),seq.length()); index++) {
        if ((this.charAt(index) - seq.charAt(index)) != 0) {
          return (this.charAt(index) - seq.charAt(index));
        }
      }
      if (this.length() != seq.length()){
        return this.length() - seq.length();
      }
    }
   return 0;
  }

}
