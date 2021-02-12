13. Write a Java Program to Handle Arithmetic Exceptions and InputMisMatchExceptions.


import java.util.Scanner;
import java.util.InputMismatchException;
public class ArithInputMismatchException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
         int num1=30, num2=0;
         int output=num1/num2;
         System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e)
        {
         System.out.println ("You Shouldn't divide a number by zero");
         }
        try {
            System.out.print("Enter an integer: ");
            int num = s.nextInt();
            System.out.println("You entered " + num);
        } catch (InputMismatchException e) {
            System.out.println("You have entered invalid data");
        }
    }
}

output:-
You Shouldn't divide a number by zero
Enter an integer: e
You have entered invalid data



