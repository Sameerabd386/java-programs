interface A {
     void show();
     void config();
    }
class  B implements A {
    public void show() {
      System.out.println("showing");
   }
   public void config() {
     Systm.out.println("configuring");
    }
 }

public static void main(String[] args) {
    B bj = new B();
    b.draw();
    b.config();
}
