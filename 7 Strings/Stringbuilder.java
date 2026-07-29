public class Stringbuilder {
  public static String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i = 1; i < str.length(); i++){
      if(str.charAt(i) == ' ' && i < str.length()-1){
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }
    }

    return sb.toString();
  }

  

//  public static String compress(String str){
//   StringBuilder newString = new StringBuilder("");
//   for(int i = 0; i < str.length(); i++){
//     Integer count = 1;
//     while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//        count++;
//        i++;
//     }
//     newString.append(str.charAt(i));
//     if(count > 1){
//       newString.append(count.toString());
//     }
//   }
//   return newString.toString();
//  }

public static String compress(String str){
  StringBuilder sb = new StringBuilder("");
  for(int i = 0; i < str.length(); i++){
    Integer count = 1;
    while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
      count++;
      i++;
    }
    sb.append(str.charAt(i));
    if(count > 1){
      sb.append(count.toString());
    }
  }
  return sb.toString();
}

  public static void main(String[] args) {
    // StringBuilder sb = new StringBuilder("");
    // for (char ch = 'a'; ch <= 'z'; ch++){
    //   sb.append(ch);
    // }
    // //O(26)  --> for String Builder
    // //O(n^2) --> for string
    // System.out.println(sb.length());

    String str = "hello world";
    System.out.println(toUpperCase(str));

    String string = "aaabbbcccd";
    System.out.println(compress(string));
  }
}
