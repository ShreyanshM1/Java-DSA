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

  public static int lengthOfString(String str){
    if (str.length() == 0){
      return 0;
    }
    return lengthOfString(str.substring(1)+1);
  }

  public static int countSubstrings(String str, int start, int end, int n){
    if(n == 1){
      return 1;
    }
    if(n <= 0){
      return 0;
    }

    int res = countSubstrings(str, start+1, end, n-1) +
              countSubstrings(str, start, end-1, n-1) -
              countSubstrings(str, start+1, end-1, n-2);

    if(str.charAt(end) == str.charAt(start)){
      res++;
    }

    return res;
  }

  
  public static void main(String[] args) {
    // int arr[] = {1,2,3,4,5,2,2,7};
    // allOccurences(arr, 0, 2);
    // printDigits(2019);
    String str = "aba";
    int n = str.length();
    System.out.print(countSubstrings(str, 0, n-1, n));
  }
}
