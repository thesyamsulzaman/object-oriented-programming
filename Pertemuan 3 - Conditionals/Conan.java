public class Conan {

  public static class Human {
    public String nama;
    public int umur;
    public String tempatTinggal;
    public int tabungan;

    Human(String nama, int umur, String tempatTinggal, int tabungan) {
      this.nama = nama;
      this.umur = umur;
      this.tempatTinggal = tempatTinggal;
      this.tabungan = tabungan;
    }
  }

  public static void main(String[] args) {
    Human jebolanDon = new Human("Filson Fisk", 42, "Nevada", 12000000);
    Human jebolanUnderboss = new Human("Gustavo Fring", 35, "Nevada", 1500000 );
    Human jebolanCapo = new Human("Jessie Pinkman", 24, "California", 900000);
    Human jebolanNusaPutra = new Human("Syamsul Zaman", 20, "Nagrog", 700);

    System.out.println(getWarning(jebolanDon));
    System.out.println(getWarning(jebolanUnderboss));
    System.out.println(getWarning(jebolanCapo));
    System.out.println(getWarning(jebolanNusaPutra));
  }

  public static String getWarning(Human human) {
    String syndicate = getSyndicate(
      human.umur,
      human.tempatTinggal,
      human.tabungan
    );


    switch(syndicate.toLowerCase()) {
      case "don":
      case "underboss":
      case "capo":
        return human.nama + " kemungkinan adalah seorang anggota mafia dengan pangkat " + syndicate;
      default:
        return human.nama + " tidak mencurigakan.";
    }
  }

  public static String getSyndicate(
      int umur, 
      String tempatTinggal, 
      int tabungan
  ) {
    if ( umur > 40 & tabungan > 10000000) {
      switch(tempatTinggal.toLowerCase()) {
        case "nevada":
        case "havana":
        case "new york":
          return "Don";
        default:
          return "";
      }
    }
    
    else if (
      ( umur >= 25 & umur <= 40 ) && 
      ( tabungan > 1000000 || tabungan <= 2000000 )
    ) {
      switch(tempatTinggal.toLowerCase()) {
        case "new jersey":
        case "manhattan":
        case "nevada":
          return "Underboss";
        default:
          return "";
      }
    }

    else if (
      ( umur >= 18 & umur <= 24 ) && 
      ( tabungan < 1000000 )
    ) {
      switch(tempatTinggal.toLowerCase()) {
        case "california":
        case "detroit":
        case "boston":
          return "Capo";
        default:
          return "";
      }
    }

    else {
      return "";
    }
  }


}
