public class ArrayTester{
  public static void main(String[] args) {
    int[] nums = {1,3,5,0,-1,3,9};
    IntegerSequence r = new Range(10,20);
    IntegerSequence as = new ArraySequence(r);
    IntegerSequence arr = new ArraySequence(nums);
    System.out.println(arr.length());
    System.out.println(arr.hasNext());
    System.out.print("ArraySequence(array): ");
    while(arr.hasNext()){
      System.out.print(arr.next()+ ", ");
    }
    System.out.println();
    arr.reset();
    System.out.println(arr.next()+ ", ");
    System.out.println("ArraySequence(seq):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
      }
    System.out.println();
  }
}
