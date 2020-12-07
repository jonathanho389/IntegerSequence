import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;
  public Range(int start, int end){
    this.start = start;
    this.end = end;
    this.current = start;
    if(start > end){
      throw new IllegalArgumentException("bruh");
    }
  }

  public void reset(){
    current = start;
  }

  public int length(){
    int length1 = end - start + 1;
    return length1;
  }

  public boolean hasNext(){
    if(current > end){
      return false;
    }
    return true;
  }

  public int next(){
    int now = current;
    current++;
    if(now > end){
      throw new NoSuchElementException("No more values");
    }
    return now;
  }
}
