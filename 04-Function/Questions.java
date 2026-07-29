package D_Functions;
import java.util.*;


//average of 3 numbers

// public class questions {
//   public static double average(double x,double y, double z){
    
//     return (x+y+z) / 3;
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the first number: ");
//     double x = sc.nextDouble();
//     System.out.print("Enter the second number: ");
//     double y = sc.nextDouble();
//     System.out.print("Enter the third number: ");
//     double z = sc.nextDouble();
//     System.out.print("The average value is "+ average(x, y, z)+"\n");
//   }
// }

// Even or not

// public class questions {
//   public static boolean isEven(int number){
    
//     if(number%2==0){
//       return true;
//     }
//     else{
//       return false;
//     }
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner( System.in);
//     System.out.print("Enter any number to check whether a number is even or odd: ");
//     int number = sc.nextInt();
//     if(isEven(number)){
//       System.out.println("Your number is even.That's a great choice.");
//     }
//     else{
//       System.out.println("You chose a odd number.That tells a lot about you.You want to become odd one out.");
//     }
//   }
// }


// PALINDROME


// public class questions {

//   public static boolean isPalindrome (int palindrome){
//     int number = palindrome;
//     int reverse = 0;
//     while (palindrome > 0){
//       int remainder = palindrome % 10;
//       reverse = reverse * 10 + remainder;
//       palindrome /= 10;
//     }
//     if(reverse == number){
//       return true;
//     } else { 
//       return false;
//     }
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter any number to check whether it is palindrome or not: ");
//     int palindrome = sc.nextInt();
    
//     if(isPalindrome(palindrome)){
//       System.out.println("Congrats!! You chose a palindrome.");
//     } else {
//       System.out.println("Try again.");
//     }
//   }
// }

// MATH CLASS

// public class questions {

//   public static void main(String[] args) {
//     int a = 2;
//     int b = 3;
//     int n = 16;
//     int pow = (int)Math.pow(a, b);
//     int avg = Math.avg(a,b,n);
//     int max = Math.max(a, b);
//     int min = Math.min(a, b);
//     int sqrt = (int) Math.sqrt(n);
//     System.out.println(max);
//     System.out.println(min);
//     System.out.println(sqrt);
//     System.out.println(pow);
//   }
// }

// Sum of the digits in an integer


//public class questions {

//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.print("Input an integer: ");
//       int digits = sc.nextInt();
//       System.out.println("Sum of digits is "+sumDigits(digits));
//   }

//   public static int sumDigits(int n){
//     int sum = 0;
//     while(n>0){
//       int lastDigit = n % 10;
//       sum += lastDigit;
//       n /= 10;
//     }
//     return sum;
//   }
// }


