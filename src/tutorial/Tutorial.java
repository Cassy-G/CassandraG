package tutorial;
import java.util.Scanner;

public class Tutorial {

   
    public static void main(String[] args) {
     
        Scanner proj = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String nm = proj.nextLine();
        
        System.out.print("Enter age: ");
        int age = proj.nextInt();
        
        
        
        System.out.print("welcome " +nm+ " your age is " +age);
        
    }
    
}
