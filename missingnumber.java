// AN AMAZON PROBLEM NEED TO FIND MISSIN NUMMBER FROM AN ARRAY GIVEN IN RANGE FOM 0-N 

// TO SOLVE THIS WE USE CYCLIC SORT ALGORITHM LOGIC THEN MAKE SOME CHANGES

import java.util.*;

public class missingnumber{
     public static void main(String args[]) {
       int[] arr = {4,1,0,2};
       System.out.println("missing number is:"+" "+sort(arr));
       }
       
    static int sort(int[] arr) {
         int i=0;
         while(i<arr.length) {
             int correct = arr[i];                                 // HERE VALUE WILL SAME AS INDEX NUMBER
              if(arr[i] < arr.length && arr[i] != arr[correct]) {          // VALUE SHOULD BE LESS THAN LENGTH AND NOT EQUAL TO INDEX THEN SWAP
                       swap(arr,i,correct);
                     }
              else {
                   i++;
               }
             }
        for(int index = 0; index < arr.length; index++) {
              if(arr[index] != index) {                            // IF VALUE OF INDEX IS NOT EQUAL TO INDEX THEN THEN RETURNS INDEX WHICH  
                  return index;                                                                          //  WILL BE UR MISSING NUMBER 
             }
           }
       
        return arr.length;
    }
    
   static void swap(int[] arr, int first, int second) {
          int temp = arr[first];
          arr[first] = arr[second];
          arr[second] = temp;
       }
    }
