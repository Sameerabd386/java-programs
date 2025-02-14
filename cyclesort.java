// CYCLE SORT MOST IMP SORTING USED WHEN 0-N OR 0-N-1 NUMBERS IS GIVEN

import java.util.*;

public class cyclesort{
    public static void main(String args[]) {
       int[] arr = {6,4,1,3,4,5};
       sort(arr); 
       System.out.println(Arrays.toString(arr));
      }
   public static void sort(int[] arr) {
      int i=0;
      while(i<arr.length) {
         int correct = arr[i]-1;
          if(arr[i] != arr[correct]) {
               swap(arr,i,correct);
              }
          else {
             i++;
             }
         }
       }
  public static void swap(int[] arr,int first,int second) {
           int temp = arr[first];
           arr[first] = arr[second];
           arr[second] = temp;
        }
     }                                
