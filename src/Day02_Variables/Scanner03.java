package Day02_Variables;

import java.util.Scanner;

public class Scanner03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;

    System.out.println(a + b);
    sc.close();

  }
}
