// working wih arrays

import java.util.*;

public class array1  {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
     int[] arr = new int[2];
      System.out.println("Enter the input for array:");
       for(int i=0; i<20; i++) {
        arr[i] = sc.nextInt();
     }
     for(int i=0; i<20; i++) {
         System.out.println(Arrays.toString(arr));
      }

// this below code is for string of arrays using Arrays.toString method which gives o/p in [o/p] form.

      String[] str = new String[4];
      for(int i=0; i<str.length; i++) {
        str[i] = sc.next();
       }
       System.out.println(Arrays.toString(str));
   }
 }
