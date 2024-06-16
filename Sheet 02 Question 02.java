import java.util.Scanner;

public class Main{

  public static void main(String [] args){
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Enter the First name: ");
    String name = sc1.nextLine();
    System.out.print("Enter the DIT Number:");
    String ItNum = sc1.nextLine();
    System.out.print("Enter Your District:");
    String District = sc1.nextLine();
    
    System.out.println("\n\nDit Number :" + ItNum);
    System.out.println("Name :"+ name);
    System.out.println("District :"+ District);
  }
}