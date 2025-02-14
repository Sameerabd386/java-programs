// program for inverted half pyramid in java

public class invertedhalfpyramid {
     public static void main(String[] args) {
      int m = 4;  
      for(int i=m; i>=1; i--) 
       {
      for(int j=1; j<=i; j++)     
       {
       System.out.print("*");
       }
       System.out.println();
       }
   }
 }
