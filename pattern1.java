public class Main {

  public static void main(String[] args) {
    int rows = 5;
    char k='A';
    for (char i = 'A'; i <= 'E'; ++i) {
      for (char j = 'A'; j <= i; ++j) {
        System.out.print(k++ +" ");
      }
      System.out.println();
    }
  
  }
}
