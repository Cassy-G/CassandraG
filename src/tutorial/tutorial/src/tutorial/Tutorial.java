
package tutorial;
import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) {
     
        try (Scanner proj = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String nm = proj.nextLine();   // reads full name
            
            System.out.print("Enter age: ");
            int age = proj.nextInt();
            proj.nextLine(); // ✅ clears the leftover newline after nextInt()
            
            System.out.print("Where do you live?: ");
            String li = proj.nextLine();   // now works properly
            
            System.out.print("Welcome " + nm + ", your age is " + age + " and you live in " + li + ".");
        }
    }
}
