package D_Functions;

public class Callbyvalue {
  public static void swap(int a,int b){
    //SWAP
    int temp ;
    System.out.println("Before Swapping a = "+a+" and b = "+b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("After Swapping a = "+a+" and b = "+b);
  }
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    swap(a,b);
  }

}
