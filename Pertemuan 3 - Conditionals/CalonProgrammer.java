public class CalonProgrammer {
  public static void main(String[] args) {
    int scoreKoding = 61;
    String nilaiKoding = "";
    String nilaiInterview = "";

    if ( scoreKoding > 80 ) {
      nilaiKoding = "LOLOS";
      nilaiInterview = "A";
    }

    else if ( scoreKoding > 60 & scoreKoding < 80 ) {
      nilaiKoding = "DIPERTIMBANGKAN";
      nilaiInterview = "B";
    }

    else if ( scoreKoding < 60 ) {
      nilaiInterview = "GAGAL";
    }


    if (
     (nilaiKoding == "LOLOS" || nilaiKoding == "DIPERTIMBANGKAN") &&
     (nilaiInterview == "A" || nilaiInterview == "B")
    ) {
      System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
    } else {
      System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
    }

  }
}
