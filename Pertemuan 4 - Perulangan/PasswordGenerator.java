import java.util.Scanner;

public class PasswordGenerator {
  public static String charLib = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*()_-+={}[]|:;’<>,.?/ ";
  public static String[] LETTER_TABLE = charLib.split("");

  public static void main(String[] args) {
    String password;
    String generatedPassword;
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Password : ");

    password = input.next();
    generatedPassword = generatePassword(password);

    System.out.println(generatedPassword);
  }

  public static String generatePassword(String password) {
    String newPassword = "";

    for ( int i = 0; i < password.length(); i++) {
      Character charLetter = new Character(password.charAt(i));
      Character lowerCaseE = new Character('e');
      Character upperCaseE = new Character('E');

      int charCode = (int) charLetter;
      char newChar = (char) (charCode + 1);

      if (Character.isUpperCase(charLetter)) {
        newPassword += newChar + "" + Character.toLowerCase(newChar);
      } else if (charLetter.equals(lowerCaseE) || (charLetter.equals(upperCaseE))) {
        newPassword += '3';
      } else {
        newPassword += Character.toUpperCase(newChar);
      } 
    }

    return newPassword;
  }
}
