public class Program {

  public static void jajan() {
    int uangSiOtonk = 50000;
    int hargaMainan = 55000;

    String hasil = hargaMainan > uangSiOtonk ? "Nabung lagi nak" : "Gas Checkout Lur";
    System.out.println(hasil);
  }

  public static void main(String[] args) {
    System.out.println("------------------");
    System.out.println("---| 100 & 20 |---");
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) 100) + " - " + 100);
    System.out.println(convertByteToBinaryString((byte) 20) + " - " + 20);
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) (100 & 20)) + " - " + (byte) (100 & 20));
    System.out.println("------------------");

    System.out.println();

    System.out.println("------------------");
    System.out.println("---| 528 | 70 |---");
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) 528) + " - " + 528);
    System.out.println(convertByteToBinaryString((byte) 70) + " - " + 70);
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) (528 | 70)) + " - " + (byte) (528 | 70));
    System.out.println("------------------");

    System.out.println();


    System.out.println("------------------");
    System.out.println("---| 256 >> 3 |---");
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) 256) + " - " + 256);
    System.out.println(convertByteToBinaryString((byte) 3) + " - " + 3);
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) (256 >> 3)) + " - " + (byte) (256 >> 3));
    System.out.println("------------------");

    System.out.println();

    System.out.println("------------------");
    System.out.println("---| 600 >> 4 |---");
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) 600) + " - " + 600);
    System.out.println(convertByteToBinaryString((byte) 4) + " - " + 4);
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) (600 >> 4)) + " - " + (byte) (600 >> 4));
    System.out.println("------------------");


    System.out.println();

    System.out.println("------------------");
    System.out.println("---| 423 << 2 |---");
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) 423) + " - " + 423);
    System.out.println(convertByteToBinaryString((byte) 2) + " - " + 2);
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) (423 << 2)) + " - " + (byte) (423 << 2));
    System.out.println("------------------");


    System.out.println();

    System.out.println("------------------");
    System.out.println("---| 1 << 2 |---");
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) 1) + " - " + 1);
    System.out.println(convertByteToBinaryString((byte) 2) + " - " + 2);
    System.out.println("------------------");
    System.out.println(convertByteToBinaryString((byte) (1 << 2)) + " - " + (byte) (1 << 2));
    System.out.println("------------------");
  }


  public static String convertByteToBinaryString(byte numberInByte) {
    return String.format("%8s",Integer.toBinaryString(numberInByte)).replace(' ', '0');
  }

  public static int convertStringBytesToNumber(String byteNumberInString) {
    int result = 0;
    String reversedByteNumberInString = new StringBuilder(byteNumberInString)
      .reverse()
      .toString();

    for (int i = 0; i < reversedByteNumberInString.length(); i++) {
      int currentNumber = Integer.parseInt(
        String.valueOf(
         reversedByteNumberInString.charAt(i)
        )
      );

      if (currentNumber == 1) {
        result += (int) Math.pow(2, i); 
      }
    }

    return result;
  }
}
