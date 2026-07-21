package Day03_Conditions;
import java.util.*;
/**
 * Calender
 */
public class Calender {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();

    if(month == 1){
      System.out.println("january");

    }else if (month == 2){
      System.out.println("febauary");

    }else if (month ==3){
      System.out.println("march");

    }else if (month == 4){
      System.out.println("april");

    }else if (month == 5){
      System.out.println("may");

    }else if (month == 6){
      System.out.println("june");

    }else if (month == 7){
      System.out.println("july");

    }else if (month == 8){
      System.out.println("august");

    }else if (month ==9){
      System.out.println("september");

    }else if (month == 10){
      System.out.println("October");

    }else if (month ==11){
      System.out.println("November");

    }else if (month ==12){
      System.out.println("December");

    }else{
      System.out.println("Invalid Month");
    }

    }

  }