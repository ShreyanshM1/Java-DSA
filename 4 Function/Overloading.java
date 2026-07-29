package D_Functions;

// public class overloading {
//   public static int sum(int a,int b){
//     return a+b;
//   }
//   public static int sum(int a, int b, int c){
//     return a+b+c;
//   }
//   public static void main(String[] args) {
//     System.out.println(sum(3, 4));
//     System.out.println(sum(3, 3, 1));
//   }
// }



public class Overloading {
  public static int Sum (int a, int b){
    return a+b;
  }
  public static float Sum (float a, float b){
    return a+b;
  }
  public static void main(String[] args) {
    System.out.println(Sum(10, 8));
    System.out.println(Sum(7.8f, 10.2f));

  }
}
