public class Main {

  public static void main(String[] args) {
    final int size = 5;
    int i = 0;

 
    String[] firstPattern = new String[size];
    String[] secondPattern = new String[size];

    
    while (i < size) {
      StringBuilder line = new StringBuilder();
      int j = 0;
      while (j < size) {
        line.append(" * ");
        j++;
      }
      firstPattern[i] = line.toString();
      i++;
    }


    for (i = 0; i < size; i++) {
      StringBuilder line = new StringBuilder();
      for (int k = size - 1; k > i; k--) {
        line.append(" ");
      }
      for (int j = 0; j <= i; j++) {
        line.append(" * ");
      }
      secondPattern[i] = line.toString();
    }


    for (i = 0; i < size; i++) {
      System.out.println(firstPattern[i] + "\t" + secondPattern[i]);
    }
  }
}
