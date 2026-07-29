package I_OOPS;

public class Inheritance {
  public static void main(String[] args) {
    // Fish shark = new Fish();
    // shark.eat();

    // Dog scooby = new Dog();
    // scooby.eat();
    // scooby.legs = 4;
    // System.out.println(scooby.legs);

    Bird chipu = new Bird();
    chipu.eat();
    chipu.fly();

  }
}

//Base Class
class Animal {
  String color;

  void eat(){
    System.out.println("eats");
  }

  void breathe (){
    System.out.println("breathes");
  }
}

class Mammal extends Animal{
   void walk() {
    System.out.println("walks");
   }
}

class Cat extends Mammal{
  void innocent(){
    System.out.println("Innocent");
  }
}

class Dog extends Mammal{
  void loyal(){
    System.out.println("Loyal");
  }
}

class Human extends Mammal{
  void intelligent(){
    System.out.println("Intelligent");
  }
}

class Fish extends Animal{
  void swim() {
   System.out.println("swim");
  }
}

class Tuna extends Fish{
  void benifits(){
    System.out.println("Protein rich food");
  }
}

class Shark extends Fish{
  void big(){
    System.out.println("Big");
  }
}

class Bird extends Animal{
  void fly() {
   System.out.println("fly");
  }
}

class Peacock extends Bird{
  void dance() {
    System.out.println("Dance");
  }
}

//Derived Class / Sub Class

// class Fish extends Animal {
//   int fins;

//   void swim(){
//     System.out.println("Swims in water");
//   }
// }




/*
Inheritance :
When properties and methods of base class passed to derived class

Types of Inheritance 
1.Single Level - parent --> derived

2.Multi Level - base --> derived --> derived

3.Hierarchial - derived <-- base --> derived

4.Hybrid - 
*/
