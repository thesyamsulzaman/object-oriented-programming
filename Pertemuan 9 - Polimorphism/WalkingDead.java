public class WalkingDead {
  public static void main(String[] args) {
    Human ucup = null;

    // Disini Zombie bisa di-instansiasi dengan class Human 
    // karena Zombie juga adalah Human
    Human bradVicker = new Zombie("Brad Vicker", 100);

    Human rickGrimes = new Human("Rick Grimes", 100);
    Monster nemesis = new Monster("Nemesis", 1000, "Im fast as hell");

    // Ucup bisa berubah menjadi monster walau ucup itu Human
    ucup = nemesis;

    System.out.println(nemesis.getSuperPower());
    System.out.println(ucup.getSuperPower());
  }
}

class Human {
  protected String name;
  protected int energy;
  protected String superPower = "I dont have any";

  Human(String name, int energy) {
    this.name = name;
    this.energy = energy;
  }

  Human(String name, int energy, String superPower) {
    this.name = name;
    this.energy = energy;
    this.superPower = superPower;
  }
  
  public String getSuperPower() {
    return this.superPower;
  }

  public String scream() {
    return "Im a Hooman";
  }

  public String run() {
    return "Run Bitch, RUNNN";
  }
}

class Zombie extends Human {
  Zombie(String name, int energy) {
    super(name, energy);
  }

  Zombie(String name, int energy, String superPower) {
    super(name, energy, superPower);
  }

  @Override
  public String scream() {
    return "Im a Zombie";
  }

  @Override
  public String run() {
    return "Srreet, Srret";
  }
}

class Monster extends Zombie{
  Monster(String name, int energy, String superPower) {
    super(name, energy, superPower);
  }

  @Override
  public String scream() {
    return "Im a Monster";
  }

  @Override
  public String run() {
    return "Wusssh";
  }
}
