import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{

  public static void main(String []args){
    //canner sc = new Scanner(System.in);
    InputStreamReader r1 = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r1);
    BufferedReader br1 = new BufferedReader(r1);
    BufferedReader br2 = new BufferedReader(r1);
    try{
      System.out.print("Enter Length :");
      float len = Float.parseFloat(br.readLine());
      System.out.print("Enter Width :");
      float win = Float.parseFloat(br.readLine());
      System.out.print("Enter Height :");
      float hei = Float.parseFloat(br.readLine());

      float vol = len * win * hei;

      System.out.println("Volume is " + vol);
    }
    catch(IOException e){
      System.out.println("Error: " + e);
    }


  }
}