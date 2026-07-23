package Day03_Conditions;
import java.util.*;
/**
 * Calculator
 */
public class Calculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int operation = sc.nextInt();

  
    if (operation == 1) { // Addition (+) .//
       System.out.println(a + b);

      //  Substraction(-)//
    } else if (operation == 2) { 
      System.out.println(a - b);
    
      // Multiplication (*)//
    } else if (operation == 3) {
      System.out.println(a * b);

    //  division (/)//
    } else if (operation == 4) {
      System.out.println(a / b);

    // Modulo (%)//
    } else if (operation == 5) {
      System.out.println(a % b);

    }else{
     System.out.println("Invalid Operation");
    }
    sc.close();


  }
}