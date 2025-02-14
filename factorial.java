import java.util.*;

public class factorial {
   public static void printfactorial(int n) {
      int fact = 1;
      for(int i=n; i>=1; i--) {
          fact = fact*i;
         }
          System.out.println(fact);
          return;
     }
public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      int n = sc.nextInt();
      printfactorial(n);
  }
}
