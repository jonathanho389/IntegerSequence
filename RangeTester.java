public class RangeTester{
  public static void main(String[] args) {
    IntegerSequence nums = new Range(10, 20);
    System.out.println(nums.length());
    System.out.println(nums.hasNext());
    while(nums.hasNext()){
      System.out.print(nums.next());
      if(nums.hasNext()){
        System.out.print(",");
      }
    }
    System.out.println();
    System.out.println(nums.length());
    while(nums.hasNext()){
      System.out.print(nums.next());
      if(nums.hasNext()){
        System.out.print(",");
      }
    }
    System.out.println();
    nums.reset();
    while(nums.hasNext()){
      System.out.print(nums.next());
      if(nums.hasNext()){
        System.out.print(",");
      }
    }
  }
}
