public class Range{
  private int start, end, current;
  public Range(int start, int end){
    this.start = start;
    this.end = end;
    this.start = current;
  }

  public void reset(){
    current = start;
  }

  public int length(){
    int length1 = end - start;
    return length1;
  }

  public boolean hasNext(){
    if(current >= end){
      return false;
    }
    return true;
  }


}
