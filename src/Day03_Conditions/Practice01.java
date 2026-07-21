package Day03_Conditions;

import java.util.Scanner;

/**
 * Practice01
 */
public class Practice01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
    

  }
}