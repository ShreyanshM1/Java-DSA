package I_OOPS;

public class keywords {
  public static void main(String[] args) {
    // Student s1 = new Student();
    // s1.schoolName = "JMV";
    // System.out.println(s1.returnPercentage(80, 90, 100));

    // Student s2 = new Student();
    // System.out.println(s2.schoolName);

    // Student s3 = new Student();
    // s3.schoolName = "abc";
    // System.out.println(s3.schoolName);

    Horse h = new Horse();
    System.out.println(h.color);
  }
}

class Student {
  static int returnPercentage(int math, int phy, int chem){
     return (math+phy+chem) / 3;
  }
  String name;
  int roll;

  static String schoolName;

  void setName(String name){
    this.name = name;
  }
  String getName(){
    return this.name;
  }
}

class Animal {
  String color;
  Animal(){
    System.out.println("Animal constructor is called");
  }
}

class Horse extends Animal {
  Horse() {

    super.color = ("brown");
    System.out.println("Horse constructor is called");
  }
}