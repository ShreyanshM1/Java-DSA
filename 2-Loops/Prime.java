
// import java.util.*;
// public class Prime{
//   public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter your number: ");
//    int n = sc.nextInt();
//    if(n == 2){
//     System.out.println(n+" is a prime number");
//    }
//    else{
//     boolean isPrime = true;
//     for(int i = 2; i <= Math.sqrt(n); i++){
//       if(n%i==0){
//         isPrime = false;
//       }
//     }
//     if(isPrime == true){
//       System.out.println(n+" is a prime number");
//     }else{
//       System.out.println(n+" is not a prime number");
//     }
//   }
//   }
// }


// import java.util.*;

//how many times hello is printed

// public class prime {

//   public static void main(String[] args) {
//     for (int i=0; i<5; i++){
//       System.out.println("Hello");
//       i+=2;
//       //2 times hello will be printed
//     }
//   }
// }

//reads a set of Z,and then prints sum of the even and odd integers

// import java.util.*;
// public class prime{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number;
//     int choice;
//     int evenSum = 0;
//     int oddSum = 0;
//     do{
//       number = sc.nextInt();
//       if(number%2==0){
//         evenSum+=number;
//       }else{
//         oddSum+=number;
//       }
//       System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
//       choice = sc.nextInt();
//     }while(choice == 1);
    
//     System.out.println("Sum of even numbers is "+evenSum);
//     System.out.println("Sum of odd numbers is "+oddSum);
  
//   }
  
// }


// factorial of a number

// import java.util.*;
// public class prime {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     int factorial = 1;
//     if(num == 0||num == 1){
//       System.out.println("factorial of "+num+" is 1");
//     }
//     else{
//       for(int i = 2;i<=num;i++){
//        factorial *= i;
//     }
//     System.out.println("factorial of a "+num+" is "+factorial);
//     }
    
//   }
// }


//Multiplication table

// import java.util.*;
// public class Challenges {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int table;
//     for(int i = 1; i<=10; i++){
//       table = i*n;
//       System.out.println(table);
//     }
    
//   }
// }

//FizzBuzz
import java.util.*;
public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    boolean isFizz = false;
    boolean isBuzz = false;
    boolean isFizzBuzz = false;
    do{
     System.out.println("Enter any number between 1 to 100"); 
     i = sc.nextInt();
     if(i%3==0){
       isFizz = true;
     }
     else if(i%5==0){
      isBuzz = true;
     }else if(i%3==0&&i%5==0){
      isFizzBuzz = true;
     }
    }while(i<=100);
    if(isFizz==true)
    System.out.println("Fizz");
    else if(isBuzz==true)
      System.out.println("Buzz");
    else if(isFizzBuzz == true)
      System.out.println("FizzBuzz");
  }
}