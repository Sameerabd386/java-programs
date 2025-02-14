// given an array from 1-n need to find missing numbers from an array 
// same use cyclic sort

public class findallmissing {
      public static void main(String args[]) {
            int[] nums = {4,3,2,7,8,2,3,1};
            System.out.println(sort(nums));
           }
      static int sort(int[] arr) {
            int i=0;
            while(i<nums.length) {
               int correct = nums[i]-1;
               if(nums[i] != nums[correct]) {
                   swap(arr,i,correct);
                  }
               else {
                  i++;
                 }
               }
 
      for(int index = 0; index < nums.length; index++) {
           if(nums[index] != index+1) {
                return index+1;
              }
            }


    static void swap(int[] nums, int a, int b) {
             int temp = nums[a];
             nums[a] = nums[b];
             nums[b] = temp;
          }
      }
                
