public class PersegiFC {
  public static void main(String[] args) {
    int nomorPunggung = 90;
    String posisi = "";

    if (nomorPunggung % 2 == 0) {
      posisi += "Target Attacker";

      if (nomorPunggung >= 50 && nomorPunggung <= 100) {
        posisi += " - Calon Capten team";
      }
    }

    // Ini bilangan ganjil
    if (nomorPunggung % 2 == 1) {
      posisi += "Defender";

      if (nomorPunggung > 90) {
        posisi += " - Playmaker";
      }
    }

    // Ini bilangan ganjil juga
    if (nomorPunggung % 3 == 0 || nomorPunggung % 5 == 0) {
      posisi += " - Keeper";
    }

    System.out.println(posisi);

  }
}
