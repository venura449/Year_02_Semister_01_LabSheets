
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // excersise 4

    System.out.print("Enter the Number(1-7) : ");
    Scanner s2 = new Scanner(System.in);
    int choice = s2.nextInt();
    String message;

    switch (choice) {
      case 1:
        message = "Monday";
        break;
      case 2:
        message = "Tuesday";
        break;

      case 3:
        message = "Wednesday";
        break;

      case 4:
        message = "Thursday";
        break;

      case 5:
        message = "Friday";
        break;
      case 6:
        message = "Satureday";
        break;

      case 7:
        message = "Sunday";
        break;

      default:
        message = "Invalid Day!";
        break;
    }

    System.out.println("Value of the Day :" + choice + "\n" + "Day of the Week :" + message + "\nGood Bye!");

  }

}
