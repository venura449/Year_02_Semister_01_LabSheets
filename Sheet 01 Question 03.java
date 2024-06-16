
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Excersise 03

    System.out.println("\n\n");

    System.out.print("Enter Your Age : ");
    Scanner s1 = new Scanner(System.in);
    int age = s1.nextInt();

    if (age > 18) {
      System.out.println("Adult");
    } else {
      System.out.println("Child");
    }
  }
}