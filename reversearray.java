//  REVERSING AN ARRAY 

import java.util.*;

public class reversearray {
    public static void main(String args[]) {
       int[] arr = {1,64,8,9,4};
       reverse(arr);
       swap(arr,0,4);
      System.out.println(Arrays.toString(arr));
   }
  static void reverse(int[] arr) {
       int start = 0;
       int end = arr.length-1;
    while(start<end) {
        swap(arr,start,end);
        start++;
        end--;
     }
   }
 static void swap(int[] arr,int index0,int index4) [
       int temp = arr[index0];
       arr[index0] = arr[index4];
       arr[index4] = temp;
    }
 }
