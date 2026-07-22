// Print 100 to 1 in reverse order.//

package Day04_Loops;
import java.util.*;
/**
 * ReverseNumber
 */
public class ReverseNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rev = 0;

    while (num > 0) {
      int lastdigit = num % 10;
      rev = rev * 10 + lastdigit;
      num /= 10; 
    }
    System.out.println(rev);

    }
  }
