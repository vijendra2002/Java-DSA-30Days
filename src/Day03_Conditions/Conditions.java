package Day03_Conditions;

import java.util.Scanner;

public class Conditions {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if (age > 15) {
      System.out.println("Adult");
    }else{
      System.out.println("Not adult");
    }

  }
}