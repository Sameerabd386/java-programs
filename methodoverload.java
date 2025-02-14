// program for method overlaoding in java
  
class player {
   String name;
   int age;

   public void info(String name){
      System.out.println(name);
     }
   public void info(int age) {
     System.out.println(age);
    }
   public void info(String name, int age) {
     System.out.println(name+" "+age);
}
}

public class methodoverload {
   public static void main(String[] args) {
      player p1 = new player();
      p1.name = "ABD";
      p1.age = 39;

 
     p1.info(p1.name,p1.age);
   }
}
