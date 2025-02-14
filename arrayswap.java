//  TO SWAP TWO NUMBERS IN AN ARRAY

import java.util.*;

public class arrayswap {
   public static void main(String args[]) {
       int[] arr = {1,3,7,4,9};
       swap(arr,1,3);                                      // use swap() with arguements as array name and index of those elements u want to swap
      System.out.println(Arrays.toString(arr));
      }
  public  static void swap(int[] arr, int index1,int index3) {
      int temp = arr[index1];
      arr[index1] = arr[index3];                   // in funtion part write same as usual code with regular logic of swap
      arr[index3] = temp;
    }
  }
