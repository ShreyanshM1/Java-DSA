import java.util.*;
import java.util.Arrays;
public class Practice {

  public static String vowels(String str){
    Integer vowelCount = 0;
    for(int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        vowelCount++;
      }
    }
    return vowelCount.toString();
  }

 

  public static void anagram (String str1, String str2){

    //Convert strings to lowercase, so that we don't have to check seperately for lower and uppercase.
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // First check - if the lengths are the same 

    if(str1.length() == str2.length()){
      //convert strings into char array
      char str1charArray[] = str1.toCharArray();
      char str2charArray[] = str2.toCharArray();
      //sort the character array
      Arrays.sort(str1charArray);
      Arrays.sort(str2charArray);
      //if the sorted arrays are same then strings are anagram
      boolean result = Arrays.equals(str1charArray, str2charArray);

      if(result){
        System.out.println(str1 + " and "+str2+" are anagrams of each other");
      } else {
        System.out.println(str1 + " and "+str2+" are not anagrams of each other");
      }
    } else {
      //case when lengths are not equal
      System.out.println(str1 + " and "+str2+" are not anagrams of each other");
    }
  }

  

  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    // System.out.print("Enter any string: ");
    // String str = new String(sc.nextLine());
    // System.out.println(vowels(str));

    System.out.print("Enter string 1: ");
    String str1 = sc.nextLine();
    System.out.print("Enter string 2: ");
    String str2 = sc.nextLine();
    anagram(str1, str2);
  }
}
