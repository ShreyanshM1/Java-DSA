// Pairs in an array

public class Subarray {
  public static void pairs(int numbers[]){
    int tp = 0;
   for(int i = 0; i < numbers.length; i++){
     int curr = numbers[i];
     for(int j = i+1; j < numbers.length; j++){
        System.out.print("("+curr+","+numbers[j]+") ");
        tp++;
      }
     System.out.println();
    }
   System.out.println("total pairs = "+tp);
  }

// Subarray

public static void subArray(int numbers[]){
  int ts = 0;
  int maxSum = Integer.MIN_VALUE;
  for(int i = 0; i < numbers.length; i++){
    int start = i;
    for(int j = i; j < numbers.length; j++){
      int end = j;
      int sum = 0;
      
      for(int k = start; k <= end; k++){   // print
        System.out.print(numbers[k]+" ");
        sum += numbers[k];   
      }
      if(sum > maxSum){
        maxSum = sum;
      }

      ts++;
      System.out.println("| Sum = "+sum);
    }
    System.out.println();
  
  }
  System.out.println("total subarrays = "+ts);
  System.out.println(maxSum);
  
}

  public static void main(String[] args) {
    int numbers[]={2,4,6,8,10};
    //pairs(numbers);
    subArray(numbers);
  }
}

