import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    data = other;
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq){
    otherseq.reset();
    data = new int[otherseq.length()];
    for(int i = 0;i < otherseq.length();i++){
      data[i] = otherseq.next();
    }
  }

  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    if(currentIndex > data.length - 1){
      return false;
    }
    return true;
  }

  public int next(){
    if(currentIndex > data.length){
      throw new NoSuchElementException("No more values");
    }
    int now = data[currentIndex];
    currentIndex++;
    return now;
  }


}
