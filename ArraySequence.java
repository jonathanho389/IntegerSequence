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

  

}
