

package D_Functions;
//import java.util.*;
public class prime {
  // public static boolean isPrime(int n){
  //   //corner cases
  //   //2
  //   if(n==2){
  //     return true;
  //   }
  //   for(int i = 2; i <= n-1; i++){
  //     if(n%i==0){
  //       return false;
  //     }
  //   }
  //   return true;
  // }



  //OPTIMIZED
  public static boolean isPrime(int n){
    if( n == 2 ){
      return true;
    }
    else{
      for(int i = 2;i <= Math.sqrt(n); i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
    }
  }

 //Prime in range

  public static void primeInRange(int n){
    for(int i = 2; i <= n; i++){
      if(isPrime(i)){
        System.out.print(i+" ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    //System.out.println(isPrime(4)); 
    primeInRange(100);
  }
}




// public class prime {
//   public static boolean isPrime(int number){
//    if(number <= 1){
//     return false;
//    }
//    else if (number == 2){
//     return true;
//    }
//    else {
//     for(int i = 2; i <= number-1; i++){
//       if(number % i == 0){
//         return false;
//       }
//     }
//     return true;
//    }

//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter any number to check whether it is prime or not: ");
//     int number = sc.nextInt();
//     if(isPrime(number)){
//       System.out.println("Number is prime number");
//     } else {
//       System.out.println("Not a prime number");
//     }
//   }
// }