package D_Functions;

public class Conversions{
  public static void biToDec(int binum){
    int myNum = binum;
    int pow = 0;
    int decNum = 0;
    while (binum>0) {
      int lastDigit = binum % 10;
      decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

      pow++;
      binum = binum / 10;
    }

    System.out.println("decimal of "+myNum+" = "+decNum);
  }

  public static void decToBi(int n){
    int myNum = n;
    int pow = 0;
    int biNum = 0;
    while(n>0){
    int rem = n%2;
    biNum = biNum + (rem *(int) Math.pow(10, pow)); 
    
    pow ++;
    n /= 2;
    }
    System.out.println("binary of "+myNum+" = "+biNum);
   }
  
  public static void main(String[] args) {
    biToDec(111);
    decToBi(7);
  }
}

