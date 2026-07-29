public class Advance {
  public static int tilingProblem(int n){//2 x n (floor size)
    //base case
    if(n == 0 || n == 1){
      return 1;
    }
    // //kaam
    // //vertical choice 
    // int fnm1 = tilingProblem(n-1);

    // //horizontal choice 
    // int fnm2 = tilingProblem(n-2);

    // int totWays = fnm1 + fnm2;
    // return totWays;
    return tilingProblem(n-1) + tilingProblem(n-2);
  }


  public static void removeDuplicates(String str, int idx, StringBuilder newStr,boolean map[]){
    if(idx == str.length()){
      System.out.println(newStr);
      return;
    }

    //kaam
    char currChar = str.charAt(idx);
    if(map[currChar - 'a'] == true){
      //duplicate
      removeDuplicates(str, idx+1, newStr, map);
    } else {
      map[currChar - 'a'] = true;
      removeDuplicates(str, idx+1, newStr.append(currChar), map);
    }
  }
 
  public static int friendsPairing(int n){
    if(n == 2 || n == 1){
      return n;
    }
    // //single
    // int fnm1 = friendsPairing(n-1);
    // //pair
    // int fnm2 = friendsPairing(n-2) ;
    // int pairWays = (n-1) * fnm2;
    // //total
    // int totWays = fnm1 + pairWays;
    // return totWays;
    return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
  }

  public static void printBinStrings(int n, int lastPlace, String str){
    if(n == 0){
      System.out.println(str);
      return;
    }

    printBinStrings(n-1, 0, str+"0");
    if(lastPlace == 0){
      printBinStrings(n-1, 1, str+"1");
    }
  }

  public static void main(String[] args) {
    System.out.println(tilingProblem(5));
    String str = "ledkhayaaylhad";
    removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    System.out.println(friendsPairing(3));
    printBinStrings(3, 0, "");
  }
}
