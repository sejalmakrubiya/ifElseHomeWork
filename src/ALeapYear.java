import java.util.Scanner;

public class ALeapYear {

    /*11.Given a year you must implement a function that returns true if it's
      A leap year must either be divisible by 400 or divisible by 4 and not 100.
       */
    public static void isLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("11. Enter any year to check for leap year: ");
        int year = scanner.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){

            System.out.print("If it is leap year = True");
         } else {
            System.out.print("If it is not leap year= false");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        isLeapYear();


    }


}























































































































































































































































































































































































































