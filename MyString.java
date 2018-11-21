public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++){
      data[i] = s.get(i);
    }
  }
  public char charAt(int index){
    if (index < 0 || index > this.length()){
      throw IndexOutOfBoundsException;
    }
    return data[index];
  }



  }
l