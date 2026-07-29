public class basics {
  public static void printDec(int n){
    if(n == 1){
      System.out.println(n);
      return;
    }
    System.out.print(n+" ");
    printDec(n-1);
  }


  public static void printInc(int n){
    if(n == 1){
      System.out.println(n+" ");
      return;
    }
    printInc(n-1);
    System.out.println(n+" ");
  }


  public static int factorial(int n){
     if( n == 0){
      return 1;
     }
     else{
      // int fnm1 = factorial(n-1);
      // int fn = n * fnm1;
      //  return  fn;
      return n * factorial(n-1);
     }
  }

  
  public static int sumOfN(int n){
    if(n == 0){
      return 0;
    } else {
      return n + sumOfN(n-1);
    }
  }


  public static int fibonacci(int n){
    if(n == 0 || n == 1){
     return n;
    } 
    else {
      // int fnm1 = fibonacci(n-1);
      // int fnm2 = fibonacci(n-2);
      // int fn = fnm1 + fnm2;
      // return fn;
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
  

  public static boolean isSorted(int arr[],int i){
    // T.C. = O(n)
    // S.C. = O(n)
    if(i == arr.length-1){
      return true;
    }
    if(arr[i] > arr[i+1]){
      return false;
    }
    return isSorted(arr, i+1);
  }

  public static int firstOccurence(int arr[],int key,int i){
   // T.C. = O(n)
   // S.C. = O(n)
   if(i == arr.length){
     return -1;
   }
   if(arr[i] == key){
    return i;
   }
   return firstOccurence(arr, key, i+1);
  }




  // public static int lastOccurence(int arr[],int key ,int i){
  //   // if(i == 0){
  //   //   return -1;
  //   // }
  //   // if(arr[i] == key){
  //   //   return i;
  //   // }
  //   // return lastOccurence(arr, key, i-1);

  //   if(i == arr.length){
  //     return -1;
  //   }
  //   int isFound = lastOccurence(arr, key, i+1);
  //   if(isFound == -1 && arr[i] == key){
  //     return i;
  //   }

  //   return isFound;
  // }

  // public static int power(int x, int n){
  //   // T.C = O(n)
  //   if(n == 0){
  //    return 1;
  //   }
  //   return x * power(x, n-1);
  // }

  public static int power(int x, int n){
    if(n == 0){
      return 1;
    }
    // int xnm1 = power(x, n);
    // int xn = x * xnm1;
    // return xn;
    return x*power(x, n-1);
  }

  public static int optimizedPower(int x, int n){
    //T.C = O(log n)
   if(n == 0){
    return 1;
   }

   int halfPower = optimizedPower(x, n/2);
   int halfPowerSq = halfPower * halfPower;

   //n is odd
   if(n % 2 != 0){
    halfPowerSq = x * halfPowerSq;
   }

   return halfPowerSq;
  }

  

  public static void main(String[] args) {
    // printDec(10);
    // printInc(10);
    // System.out.println(factorial(0));
    System.out.println(fibonacci(7));
    // int arr[] = {8,6,7,4,8,5,1};
    // System.out.println(firstOccurence(arr,5, 0));
    // System.out.println(lastOccurence(arr,8, 0));
   System.out.println(power(3, 2));
  }
}


