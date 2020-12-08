public class ArrayTester{
  public static void main(String[] args) {
    int[] nums = {1,3,5,0,-1,3,9};
    IntegerSequence arr = new ArraySequence(nums);
    System.out.println(arr.length());
    System.out.println(arr.hasNext());
    System.out.print("ArraySequence(array): ");
    while(arr.hasNext()){
      System.out.print(arr.next()+ ", ");
    }
  }
}
