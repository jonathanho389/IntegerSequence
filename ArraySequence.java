import java.util.NoSuchElementException;
public class ArraySequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    data = other;
    currentIndex = data[0];
  }

  public void reset(){
    currentIndex = data[0];
  }

  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    if(currentIndex > data[data.length - 1]){
      return false;
    }
    return true;
  }

}
