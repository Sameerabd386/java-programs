// constrcutor 

class student {
   String name;
   int age;
  
   public void info() {
      System.out.println(this.name);
      System.out.println(this.age);
    }
  }
 
public class prog1 {
   public static void main(String[] args) {
      student s1 = new student();
      s1.name = "Sameer";
      s1.age = 21;
    
   s1.info();
 }
}
