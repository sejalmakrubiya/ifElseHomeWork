import java.util.Scanner;

public class IfElseHomework {


    Scanner scanner = new Scanner(System.in);

    /*1.given two numbers,return true if the sum of both numbers is less than100.
        otherwise return false.*/
    //no return type with no parameter
    public static void lessThan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(1) Enter any number=");
        //Enter first number
        int a = scanner.nextInt();
        System.out.println("\tEnter another number=");
        //Enter second number
        int b = scanner.nextInt();
        System.out.println("\tif total of both numbers are <100,is true,otherwise fales=");
        if (a + b < 100) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
   /*2.create a function that  returns true if an integer is evenly divisible by 5,
   and false otherwise.*/
    //no return type with parameter
   public static void divisibleByFive (int x )  {
       Scanner scanner = new Scanner(System.in);

       //Entering an Integer is evenly divisible by 5 or not
       if (x% 5 == 0) {
           System.out.println("Given number is divisible by 5 is = true");
       }else {
           System.out.println("Given number is not divisible by 5 is = false ");
       }




   }

    public static void main(String[] args) {
       lessThan();
       divisibleByFive(0);

    }



}



































































































