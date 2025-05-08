
import java.util.Scanner;

public class UserInput {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();  //next : does not count on the space. nextline does
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        System.out.println("Good Morning "+ name +"\nYour are "+ age + " years old");

        scanner.close(); // it is necessary as not closing it may lead to unexpected behavior.
    }
}
