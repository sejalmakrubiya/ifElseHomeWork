import java.util.Scanner;

public class Calculation {

    /*8.write a function that takes two numbers and returns if they should be added, subtracted,multiplied or
    divided to get 24. if none of the poeration can give 24, return "none".
     */
    public static void operation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("8.Enter the number 1 for operation:  ");
        int number1 = scanner.nextInt();
        System.out.print("8.Enter the number 2 for operation:  ");
        int number2 = scanner.nextInt();
        if (number1 + number2 == 24) {
            System.out.println("Addition of two number is =24: added");

        } else if (number1 - number2 == 24) {
            System.out.println("Subtraction of two number is = 24: subtracted");
        } else {
            System.out.println("None of operation is : none");
        }


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        operation();




    }











}










































































