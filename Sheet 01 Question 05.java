
public class Main {

  public static void main(String[] args) {
    final int size = 5;
    int i = 0;

    while (i < size) {
      int j = 0;
      while (j < size) {
        System.out.print(" * ");
        j++;
      }
      System.out.print("\n\n");
      i++;
    }


    for(i=0;i<size;i++){
      for(int j=0;j<i;j++){
        System.out.print(" * ");
      }
      System.out.print("\n\n");
      for(int k=size;k>i;k--){
        System.out.print(" ");
      }
    }

  }

}
