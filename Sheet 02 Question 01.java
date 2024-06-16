public class Main{

  public static void main(String [] args){
    int miles = 26;
    int yards = 385;

    
    float miles_yards = yards/1760.0f;
    float kilometer_miles = miles *1.609f;

    System.out.println("miles in Km : " + miles_yards +"\n" + "yards in Km : " + kilometer_miles);

    
  
  }
}