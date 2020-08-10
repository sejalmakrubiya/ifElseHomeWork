import java.util.Scanner;

public class LessThanOrEqualToZero {

    //no return type without parameter
    /*6.create a method that takes an integer as its only argument and returns true if it's less
        than or equal to zero,otherwise return false
    */
    public static void lessThanOrEqualToZero() {

        Scanner scanner = new Scanner(System.in);


        System.out.print("6. Enter the number to check if it is less than or equal to Zero");
        int d = scanner.nextInt();
        if (d <= 0) {
            System.out.println("Given number is less than or equal to 0 = True ");

        } else {
            System.out.println("Given number is not less than or equal to 0 = False");
        }


    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        lessThanOrEqualToZero();

    }


}










































































































