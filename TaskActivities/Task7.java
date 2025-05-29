package TaskActivities;
import java.util.Scanner;


public class Task7 {


 public static double add(double a, double b) {

        return a + b;

    }

public static double subtract(double a, double b) {

        return a - b;

    }

public static double multiply(double a, double b) {

        return a * b;

    }

 public static String divide(double a, double b) {

        return (b != 0) ? String.valueOf(a / b) : "error division by zero";

    }

    



  static boolean status = true;

      

public static void main(String[] args) {



       Scanner scanner = new Scanner(System.in);



        while (status) { 

            System.out.println("Choose operation 1 to 5:");

            System.out.println("1 Addition");

            System.out.println("2 Subtraction");

            System.out.println("3 Multiplication");

            System.out.println("4 Division");

            System.out.println("5 Exit");

            System.out.print("Enter choice: ");

              int choice = scanner.nextInt();  

            

               

                status = (choice != 5); 

                if (!status) { System.out.println("terminated..");

                break;

            }



System.out.print("Enter first number: "); double num1 = scanner.nextDouble();

System.out.print("Enter second number: "); double num2 = scanner.nextDouble();



System.out.println ("Result: " + 

                (choice == 1 ? add(num1, num2) :

                choice == 2 ? subtract(num1, num2) :

                choice == 3 ? multiply(num1, num2) :

                choice == 4 ? divide(num1, num2) : "Invalid choice"));

        }

        

scanner.close();





    }

}