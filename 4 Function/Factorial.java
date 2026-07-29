package D_Functions;

public class Factorial {


  public static int factorial(int n){
    int f = 1;
    if(n==0||n==1){
    //  System.out.println("Factorial of "+n+ " is "+f);
    return f;
    }else{
     for(int i = 2;i<=n;i++){
      f *= i;
     } 
    //  System.out.println("Factorial of "+n+ " is "+f);
    return f;
    }
  
  } 
  //BINOMIAL COEFFICIENT
  public static int binCoeff(int n,int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);
    int binCoeff = fact_n/(fact_r*fact_nmr);
    return binCoeff;
  }
  public static void main(String[] args) {
    System.out.println(factorial(3));
    System.out.println(binCoeff(5,2));

  }

}
