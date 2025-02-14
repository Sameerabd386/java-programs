// WORKING WITH ARRAYLIST 

import java.util.*;

public class arraylist {
     public static void main(String args[]) {
       ArrayList<Integer> list = new ArrayList<>(10);
       list.add(10);
       list.add(11);
       list.add(12);       // to add elements use add()
       list.add(13);
       list.add(20);
    System.out.println(list);
    
    list.remove(2);           // to remove elements use remove() and pass index in it
   System.out.println(list);

    System.out.println(list.contains(13));
    System.out.println(list.contains(15));    // to check whether element is present in it

    list.set(3,15);                     // to replace item use set(index,item)
    System.out.println(list);
  }
}
       
      
