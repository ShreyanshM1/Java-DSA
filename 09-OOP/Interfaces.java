package I_OOPS;

public class Interfaces {
  public static void main(String[] args) {
    King k = new King();
    k.moves();

    Bear b = new Bear();
    b.eat();
  }
}

interface herbivore{
  void eat();
}

interface carnivore{
  void eat();
}

class Bear implements herbivore,carnivore {
  public void eat(){
    System.out.println("Eats both grass and flesh");
  }
}

interface ChessPlayer{
  void moves();
}

class Queen implements ChessPlayer{
  public void moves(){
    System.out.println("up, down, left, right, diagonal (in all 4 dirns)");
  }
}

class Rook implements ChessPlayer{
  public void moves(){
    System.out.println("up, down, left, right");
  }
}

class King implements ChessPlayer{
  public void moves(){
    System.out.println("up, down, left, right, diagonal (1 step at a time)");
  }
}
