import java.util.Arrays;

public class Laptop {
  String brand;
  String type;
  boolean status;
  String runningProgram[] = new String[6];
  int activeIndex = 0;

  Laptop(String brand, String type) {
    this.brand = brand;
    this.type = type;
  }

  public void setOn() {
    this.status = true;
  }

  public void setOff() {
    this.status = false;
  }

  void runProgram(String programName) {
    if (this.status) {
      if (this.activeIndex < 6) {
        this.runningProgram[this.activeIndex] = programName;
        this.activeIndex++;
      } else {
        System.out.println("Program yang dijalankan maksimal hanya 6");
        System.out.println("------------------------------------------");
      }
    } else {
      System.out.println("Nyalakan dulu komputernya");
      System.out.println("------------------------------------------");
    }
  }

  void infoLaptop() {
    System.out.println("Laptop : " + this.brand + ", Tipe : " + this.type);
    if (!this.status) {
      System.out.println("Laptop dalam keaadan mati");
    } else {
      System.out.println("Laptop dalam keaadan nyala");
    }

    if (this.status && this.runningProgram[0] != null) {
      System.out.print("Program yang sedang berjalan adalah ");
      for (int i = 0; i < this.runningProgram.length; i++) {
        if (this.runningProgram[i] != null) {
          System.out.print(this.runningProgram[i] + ", ");
        }
      }
      System.out.println();
    } else {
      System.out.println("Tidak ada program yang dijalankan");
    }



    System.out.println("------------------------------------------");
  }

  public static void main(String[] args) {
    Laptop myLaptop = new Laptop("Lenovo", "Thinkpad");
    myLaptop.infoLaptop();
    myLaptop.runProgram("MS Word");
    myLaptop.setOn();
    myLaptop.runProgram("MS Word");
    myLaptop.runProgram("Netbeans Id");
    myLaptop.infoLaptop();
    myLaptop.runProgram("Ms Excel");
    myLaptop.runProgram("Visual Studio Code");
    myLaptop.runProgram("PHP");
    myLaptop.runProgram("Ms Power Point");
    myLaptop.infoLaptop();
    myLaptop.runProgram("Google Chrome");
    myLaptop.infoLaptop();
    myLaptop.setOff();
    myLaptop.infoLaptop();
  }
}
