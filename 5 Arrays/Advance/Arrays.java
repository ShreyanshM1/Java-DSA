//import java.util.*;

//Prefix Max Subarray Sum

public class Arrays {
  //Brute Force
  public static void maxSubarraySum(int numbers[]){
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0; i < numbers.length; i++){
      for(int j = i; j < numbers.length; j++){
        int currSum = 0;
       
        for(int k = i; k <= j; k++){
          System.out.print(numbers[k]+" ");
          currSum+=numbers[k];
        }
        if(maxSum < currSum){
          maxSum = currSum;
        }
        System.out.println(" | Sum = "+currSum);
      }
      System.out.println();
      
    }
    System.out.println("Max sum of subarray is "+maxSum);
  }

  //Prefix Method
  public static void prefixMaxSum(int numbers[]){
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];

    prefix[0] = numbers[0];
    for(int i = 1; i < prefix.length; i++){
      prefix[i] = prefix[i-1] + numbers[i];
    }

    for(int i = 0; i < numbers.length; i++){
      int start = i;
      for(int j = i; j < numbers.length; j++){
        int end = j;
        int currSum = 0;
        
        currSum = i == 0 ? prefix[end] : prefix[end] - prefix[start-1];

        if(maxSum < currSum){
          maxSum = currSum;
        }
      }
    }
    System.out.println("Max sum - "+maxSum);
  }


  // Kadenes Algo

  public static void kadenes(int numbers[]){
    int maxSum = Integer.MIN_VALUE;
    int currSem = 0;

    // for(int i = 0; i < numbers.length; i++){
    //   if(numbers[i]<0){
    //     maxSum = Math.max(maxSum, numbers[i]);
    //   }
    // }
 
    for(int i = 0; i < numbers.length; i++){
      currSem += numbers[i];
      if(currSem<0){
        currSem = 0;
      }
      maxSum = Math.max(currSem,maxSum);
    }
    System.out.println("max subarray sum is : "+maxSum);
  }


  public static void main(String[] args) {
   // int numbers[]={1,-2,6,-1,3};
    int numbers[] = {-2,-3,-4,-1,-2,-1,-5,-3};
    // maxSubarraySum(numbers);
    prefixMaxSum(numbers);
    kadenes(numbers);
  }

  public static void sort(char[] str1charArray) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sort'");
  }
}