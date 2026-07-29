
//import java.util.*;
public class Questions {

  public static boolean isPalindrome(String str){
   for(int i = 0; i < str.length()/2; i++){
    int n = str.length();
      if(str.charAt(i) != str.charAt(n-1-i)){
        //not a palindrome
        return false;
      }
   }
   return true;

  }

  

  public static float getShortestPath(String path){
   int x = 0, y = 0;
   for (int i = 0; i < path.length(); i++){
      char dir = path.charAt(i);
      //South
      if(dir == 'S'){
        y--;
      }
      //North
      else if(dir == 'N'){
        y++;
      }
      //East
      else if(dir == 'W'){
        x--;
      }
      else{
        x++;
      }
   }
   int X2 = x*x;
   int Y2 = y*y;
   return (float)Math.sqrt(X2+Y2);
  }

  

  public static String subString(String str,int si,int ei){
    String subString = "";
    for(int i = si; i < ei; i++){
       subString += str.charAt(i); 
    }
    return subString;
  }

  

  public static void main(String[] args) {
    // String s1 = "Tony";
    // String s2 = new String("Tony");

    // if(s1.equals(s2)){
    //   System.out.println("both are equals");
    // }
    // else{
    //   System.out.println("not equal");
    // }

    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // System.out.println(isPalindrome(str));

    String path = "WNEENESENNN";
    System.out.println(getShortestPath(path));

    String fruits[] = {"apple", "mango", "banana"};

    String largest = fruits[0];
    for(int i = 1; i < fruits.length; i++){
      if(largest.compareTo(fruits[i])<0){
        largest = fruits[i];
      }
    }
    System.out.println(largest);
    System.out.println(subString("Hello World", 0, 5));
  }
}

