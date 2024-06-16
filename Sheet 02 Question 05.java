import java.util.Scanner;

class EvenOddNumber {

  public boolean findEvenOrOdd(int i) {
    if (i % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
}

public class Main {

  public static void main(String[] args) {
    EvenOddNumber eon = new EvenOddNumber();
    System.out.print("Enter Number to Check weather number is Even/Odd :");
    Scanner s1 = new Scanner(System.in);
    int number = s1.nextInt();
    System.out.println("\nNumber is : "+(eon.findEvenOrOdd(number) ? "Even" : "Odd"));
  }
}
