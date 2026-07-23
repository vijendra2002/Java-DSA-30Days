package Day05_Patterns;

/**
 * Pattern05
 */
public class Pattern05 {

  public static void main ( String[]args ){
    int n = 4;
    // outer loop //
    for(int i =1; i<=n; i++){
      // innner loop //
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      // inner loop 2 // -- start print
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
