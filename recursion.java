import java.util.*;

public static int recursion(int n) {
   if(n == 1) {
     return 1;
     }
   else {
     return n + recursion(n-1);
     }
  public static void main(String[] args) {
   int n = 4;
   int sum = recursion(n);
   System.out.println(sum);
}
}
