public class Assignment {
  public static void allOccurences(int arr[], int idx, int key){
    if(idx == arr.length){
      return;
    }
    if(arr[idx] == key){
      System.out.print(idx + " ");
    } 
      allOccurences(arr, idx+1, key);
  }
  static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
  public static void printDigits(int num){
    if(num == 0){
      return;
    }
    
    int lastDigit = num % 10;
    printDigits(num/10);
    System.out.print(digits[lastDigit]+" ");

  }

  
  public static void main(String[] args) {
    // int arr[] = {1,2,3,4,5,2,2,7};
    // allOccurences(arr, 0, 2);
    printDigits(2019);
  }
}
