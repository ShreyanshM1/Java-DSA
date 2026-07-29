package I_OOPS;

public class questions {
  public static void main(String[] args) {
    Vehicle obj1 = new Car();
    obj1.print();  // fnx overriding (Derived class(Car))

    Vehicle obj2 = new Vehicle();
    obj2.print();  // Base Class 

    //Animal object1 = new Dog();
    //object1.print1(); ––> ERROR

    Animal object2 = new Animal();
    object2.print();

    System.out.println(Book.count);//print - 0
    Book b1 = new Book(150);//1
    Book b2 = new Book(250);//2
    System.out.println(Book.count);//print - 2

    Test t = new Test();
    t.set_marks(98);         //Line 2
    System.out.println(Test.marks); //Line 3
    //NO ERROR
  }
}

class Vehicle{
  void print(){
    System.out.println("Base class(vehicle)");
  }
}
class Car extends Vehicle{
  void print(){
    System.out.println("Derived class(car)");
  }
}

class Animal{
  void print(){
    System.out.println("Base class");
  }
}

class Dog extends Animal{
  void print1(){
    System.out.println("Derived class");
  }
}

class Book{
  int price;
  static int count;

  public Book(int price) {
    this.price = price;
    count++;
  }
}

class Test {
  static int marks;
  void set_marks(int marks){
    this.marks = marks;          //Line 1
  }
}