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
  public String toString(){
    String str = "";
    for (int i = 0; i < this.length(); i++){
      str += charAt(i);
    }
    return str;
  }
  public CharSequence subSequence(int start, int end){
    CharSequence FirstSub = new ReversedCharSequence(RevSeq.substring(start, end));
    String MidSub = "";
    for(int i = 0; i < FirstSub.length(); i++){
      MidSub += SubFirst.charAt(i);
    }
    ReversedCharSequence FinalSub = new ReversedCharSequence(MidSub);
    return FinalSub;
  }

}
