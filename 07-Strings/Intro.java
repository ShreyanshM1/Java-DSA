// import java.util.*;

public class Intro {

  public static void printLetters(String str){
    for(int i = 0; i < str.length() ;i++){
      System.out.print(str.charAt(i));
    }
    System.out.println();
  }


  public static void main(String[] args) {
    // char arr[] = {'a', 'b', 'c', 'd'};
    // String str = "abcd";
    // String str2 = new String ("xyz");

    // System.out.println(str2);

    //Strings are IMMUTABLE

    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine(); //next()
    // System.out.println(name);

    // String fullName = "Tony Stark";
    // System.out.println(fullName.length());

    
    //Concatenation
    String firstName = "Shreyansh";
    String lastName = "Mishra";
    String fullName = firstName + " "+ lastName;
    System.out.println(fullName.charAt(0));


    printLetters(fullName);

  }
}