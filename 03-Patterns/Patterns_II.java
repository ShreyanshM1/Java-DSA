package C_Pattern;

public class Patterns_II {

  public static void hollow_rectangle(int totRows, int totCols){
    //outer loop
    for(int i = 1; i <= totRows; i++){
      //inner loop
      for(int j = 1; j <= totCols; j++){
        //cell - (i,j)
        if(i == 1 || i == totRows || j == 1 || j == totCols){
           System.out.print("*");
        } else {
           System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

 


  public static void inverted_rotated_half_pyramid(int n){
  //   //outer loop
    for(int i = 1; i <= n; i++){
  //     //spaces
      for(int j = 1; j <= n-i; j++){
        System.out.print(" ");
      }
  //     //stars
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  

  public static void inverted_half_pyramid_with_numbers(int n){

    //outer loop
    for(int i = 1; i <= n; i++){
      //inner loop -> numbers
      for(int j = 1; j <= n-i+1; j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }

  

  // public static void inverted_half_pyramid_with_numbers(int n){
    
  //   for(int i = 1; i <= n; i++){
  //     int num = i;
  //     for(int j = 5; j >= i; j--){
  //       System.out.print(num);
  //       num++;
  //     }
  //     System.out.println();
  //   }
  // }

  public static void floydTriangle(int n){
    //outer loop
    int counter = 1;
    for(int i = 1; i <= n; i++){
      //inner - how many times will counter be printed
      for(int j = 1; j <= i; j++){
        System.out.print(counter+" ");
        counter++;
      }
      System.out.println();
    }
  }

  public static void zero_one_triangle(int n){
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++){
        if((i+j)%2==0){
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }

 

  public static void butterfly(int n){
    //1st Half
    for(int i = 1; i <= n; i++){
      //stars - i
      for(int j = 1; j<=i;j++){
        System.out.print("*");
      }

      //spaces - 2*(n-i)
      for(int j = 1; j<=2*(n-i);j++){
        System.out.print(" ");
      }

      //stars - i
      for(int j = 1; j<=i;j++){
        System.out.print("*");
      }

      System.out.println();
    }
    //2nd Half
    for(int i=n;i>=1;i--){
      // stars - i
      for(int j = 1; j<=i;j++){
        System.out.print("*");
      }

      // spaces - 2*(n-i)
      for(int j = 1; j<=2*(n-i);j++){
        System.out.print(" ");
      }

      // stars - i
      for(int j = 1; j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void solid_rhombus(int n){
    for(int i = 1; i <= n; i++){
      //spaces
      for(int j = 1; j <= (n-i); j++){
        System.out.print("_");
      }
      //stars
      for(int j = 1; j<=n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }


  public static void hollow_rhombus(int n){
    for(int i = 1; i <= n; i++){
      //spaces
      for(int j = 1; j <= n-i; j++){
        System.out.print(" ");
      }

      //hollow rectangle(modified)
      //outer loop
      for(int j = 1; j <= n; j++){
        if(i == 1 || i == n || j == 1 || j == n){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }


  public static void diamond(int n){
    //1st half
    for(int i = 1; i <= n; i++){
      //spaces
      for(int j = 1; j <= n-i; j++){
         System.out.print("_");
      }

      //stars - 2i-1
      for(int j = 1; j <= (2*i)-1; j++){
        System.out.print("*");
      }

      System.out.println();
    }
    //2nd Half
    for(int i = n; i >= 1; i--){
      //spaces
      for(int j = 1; j <= n-i; j++){
        System.out.print(" ");
      }

      //stars - 2i-1
      for(int j = 1; j <= (2*i)-1; j++){
        System.out.print("*");
      }

      System.out.println();
    }
  }

  
  public static void main(String[] args) {
    // hollow_rectangle(4,5 );
    // inverted_rotated_half_pyramid(5);
    //inverted_half_pyramid_with_numbers(5);
    //floydTriangle(4);
    //zero_one_triangle(5);
    // butterfly(7);
    //solid_rhombus(7);
    //hollow_rhombus(7);
    diamond(7);
  }
 }
