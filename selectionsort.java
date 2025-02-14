// selection sort program

class selectionsort {
  public static void printArray(int arr[]) {
     for(int i=0; i<arr.length-1; i++) {
        System.out.println(arr[i]);
      }
    }
  public static void main(String args[]) {
     int arr[] = {5,7,9,1,3,4};
  
   for(int i=0; i<arr.length-1; i++) {
      int smallest = i;
      for(int j=i+1; j<arr.length-1; j++) {
         if(arr[smallest] > arr[j]) {
           smallest = j;
         }
        }
       int temp = arr[smallest];
       arr[smallest] = arr[i];
       arr[i] = temp;
     }
   printArray(arr);
  }
}
