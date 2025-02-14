// WORKING WITH ARRAYLIST FOR MULTIDIMENSIONAL 

import java.util.*;

public class arraylist2D {
     public static void main(String args[]) {
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       Scanner sc = new Scanner(System.in);

   for(int i=0; i<3; i++) {                // for initialisation 
          list.add(new ArrayList<>());
      }

   for(int i=0; i<3; i++) {                                   // for adding elements 
      for(int j=0; j<3; j++) {
       list.get(i).add(sc.nextInt());
      }
    }
  System.out.println(list);
 }
} 
