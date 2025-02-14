// java program to print hollow Rectangle 

import java.util.*;

public class hollowrectanglepattern {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows:");
    int m = sc.nextInt();
    System.out.println("Enter the no of columns:");
    int n = sc.nextInt();
    for(int i=1; i<=m; i++) 
    {
     for(int j=1; j<=n; j++)
      {
       if(i==1 || j==1 || i==m || j==n)
         System.out.print("*");
       else 
        System.out.print(" ");
      }
     System.out.println();
    }
   }
 }
