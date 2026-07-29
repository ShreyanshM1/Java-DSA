 public class Practice {

  public static void swapNumbers(int x, int y){
    System.out.println("Before swap: x = "+x+" and y = "+y);
    x = x ^ y;
    y = x ^ y;
    x = x ^ y;
    System.out.println("After swap: x = "+x+" and y = "+y); 
  }

  public static int add1ToInt(int x){  
    int bitMask = 1 << 1;
    return x | (bitMask-1);
  }

  public static void main(String[] args) {
    // swapNumbers(12, 13);
    System.out.println(add1ToInt(5));

    // int x = 6;
    // System.out.println(x+" + "+1+" is "+-~x);
    // x = -4;
    // System.out.println(x+" + "+1+" is "+-~x);x = 0;
    // System.out.println(x+" + "+1+" is "+-~x);

    //Convert uppercase character to lowercase
    for(char ch = 'A'; ch <= 'Z'; ch++){
      System.out.print((char)(ch | ' '));
    }
  }
}
