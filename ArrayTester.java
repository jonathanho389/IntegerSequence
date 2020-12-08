public class ArrayTester{
  public static void main(String[] args) {
    int[] nums = {1,3,5,0,-1,3,9};
    ArraySequence arr = new ArraySequence(nums);
    System.out.println(arr.length());
    System.out.println(arr.hasNext());
  }
}
