import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    data = other;
    currentIndex = 0;
  }

  public void reset(){
    currentIndex = data[0];
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
    int now = data[currentIndex];
    currentIndex++;
    if(currentIndex > data.length){
      throw new NoSuchElementException("No more values");
    }
    return now;
  }

}
