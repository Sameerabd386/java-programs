// Taking input in java

import java.util.*;

public class inp {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number :");
     int num = sc.nextInt();
     if(num % 2 == 0)
      {
       System.out.println("given number"+num+"is even");
      }
     else {
       System.out.println("not even");
       }
  }
}
