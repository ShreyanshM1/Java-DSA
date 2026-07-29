package I_OOPS;

public class OOPS {
  public static void main(String args[]) {
    Pen p1 = new Pen();  //created a pen obj called p1
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    p1.setColor("Yellow");
    System.out.println(p1.getColor());

    BankAccount myAcc = new BankAccount();
    myAcc.username = "shreyanshMishra";
    myAcc.setPassword("abcd");
  }
}

class BankAccount{
  public String username;
  //private String password;

  protected void setPassword(String pwd){
    //password = pwd;
  }
}

class Pen{
  private String color;
  private int tip;

  String getColor(){
    return this.color;
  }

  int getTip(){
    return this.tip;
  }
  void setColor (String newColor) {
    this.color = newColor;
  }

  void setTip (int tip){
    this.tip = tip;
  }
}

class Student {
  String name;
  int age;
  float percentage;

  void calcPercentage(int phy, int chem, int maths){
     percentage = (phy+chem+maths)/3;
  }
}