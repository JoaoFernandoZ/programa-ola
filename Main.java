import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in);

      System.out.println("Olá Mundo");
      System.out.println("Digite seu nome");

      String name = myScanner.nextLine();
      System.out.println("Olá " + name);
      myScanner.close();
    }
  }
  