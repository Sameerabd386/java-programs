import java.util.*;

class stringfun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name:");
        String name = sc.nextLine();
        System.out.println("my name is "+name);
        System.out.println(name.length());            // checking length
        String name2 = "Anam";
        if(name.compareTo(name2)==0) {       // comparing string
            System.out.println("equal");
           }
          else {
            System.out.println("not equal");
        }
        String sentence = name.substring(2,name.length());
        System.out.println(sentence);
    }
}
