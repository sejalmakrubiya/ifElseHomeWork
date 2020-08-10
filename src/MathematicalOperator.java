import java.util.Scanner;

public class MathematicalOperator {

    /*10.create a function that takes two numbers and a mathematical operator
    + - / * and will perform a calculation with the given numbers.
     */

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("10. Enter a num1 for calculator : ");
        int num1 = scanner.nextInt();
        System.out.print("10. Enter a num2 for calculator : ");
        int num2 = scanner.nextInt();
        System.out.print("10. Enter an operator : ");
        char ope = scanner.next().charAt(0);
        System.out.print(num1 + "" + ope + "" + num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculator();
    }










}




