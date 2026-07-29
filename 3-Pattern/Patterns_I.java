
// Pyramid Pattern 

// public class Patterns_I {
//   public static void main(String[] args) {
//     for(int line = 1; line<=4; line++){
//       for(int star = 1; star<=line; star++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


//Inverted-Pyramid Pattern

// public class Patterns_I{

//   public static void main(String[] args) {
//     int n = 5;
//     for(int i = 1;i<=n;i++){
//        for(int j = n; j>=i; j--){
//         System.out.print("* ");
//        }
//        System.out.println();
//     }
//   }
// }

// public class Patterns_I {

//   public static void main(String[] args) {
//     int n = 4;
//     for(int line = 1; line <= n; line++){
//       for(int star = 1; star <= n-line+1; star++){
//           System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }

// Half-Pyramid Pattern

// public class Patterns_I {

//   public static void main(String[] args) {
//     int n = 4;
//     for(int line = 1;line<=n; line++){
//       for(int num = 1; num<=line; num++){
//         System.out.print(num);
//       }
//       System.out.println();
//     }
//   }
// }


// public class Patterns_I {

//   public static void main(String[] args) {
//     int n = 4;
//     for(int i = 1; i<=n; i++){
//       for(int j = n ; j>=i; j--){
//         System.out.print(j);
//       }
//       System.out.println();
//     }
//   }
// }

// 

//  public class Patterns_I {

//   public static void main(String[] args) {
//     int n = 4;
//    char ch = 'A';
//    for(int line = 1; line <= n; line++){
//     for(int chars = 1; chars <= line; chars++){
//       System.out.print(ch);
//       ch++;
//     }
//     System.out.println();
//    }
   
//   }
// }

// public class Patterns_I{
//   public static void main(String[] args) {
//     char ch = 'A';
//     for(int i = 1; i <= 4; i++){
//       for(int j = 1; j <= i; j++){
//         System.out.print(ch);
//         ch++;
//       }
//       System.out.println();
//     }
//   }
// }

//FLOYD'S Triangle 

public class Patterns_I {

  public static void main(String[] args) {
    int n = 5;
    int value = 1;
    for(int line = 1; line <= n; line++){
      for(int num = 1; num <= line; num++){
        System.out.print(value+" ");
        value++;
      }
      System.out.println();
    }
  }
}


