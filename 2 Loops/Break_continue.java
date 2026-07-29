

//Break Statement

// public class break_continue {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 10; i++){
//       if(i==3){
//         break;
//       }
//       System.out.println(i);
//     }
//   }
// }



//Keep entering numbers till user enters a multiple of 10

// import java.util.*;
// public class break_continue {

//   public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int n=0;
//   while(true){
//     System.out.print("Enter your number : ");
//      n = sc.nextInt();
//     if(n%10==0){
//       break;
//     }
//   }
//   System.out.println("You are finally out of the loop");
//   }
// }


//Continue Statement
// public class break_continue{
//   public static void main(String[] args) {
//     for(int i = 1; i <= 5; i++){
//       if(i==3){
//         continue;
//       }
//       System.out.println(i);
//     }
//   }
// }

//Display all numbers entered by user except multiples of 10

// import java.util.*;
// public class break_continue {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = 0;
//     while(true){
//       System.out.print("Enter your number: ");
//       n = sc.nextInt();
//       if(n%10==0){
//         continue;
//       }
//       System.out.println("number was : " + n);
//     }
//   }
  
// }

import java.util.*;
public class Break_continue {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    while(true){
      n = sc.nextInt();
      if(n%10==0){
        continue;
      }
      System.out.println("number was : "+n);
    }
  }
}