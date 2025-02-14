// PROGRAM TO PRINT MAXIMUM NUMBER FROM AN ARRAY

public class arraymaxval {
     public static void main(String args[]) {
         int[] arr = {1,3,4,8,2};
         System.out.println(max(arr));
      }
  public static int max(int[] arr) {
    int maxval = arr[0];
    for(int i=1; i<arr.length; i++) {
         if(arr[i]>maxval) {
            maxval = arr[i];
          }
       }
        return maxval;
    }
  }

