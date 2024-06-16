import java.util.Scanner;

public class Main {

  public static float calvolume(float len, float win, float hei) {
    return len * win * hei;
  }

  public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.print("Enter the length : ");
    float len = s1.nextFloat();
    System.out.print("Enter the width : ");
    float win = s1.nextFloat();
    System.out.print("Enter the height : ");
    float hei = s1.nextFloat();

    System.out.print("The volume of the cuboid is : " + calvolume(len, win, hei));

  }
}