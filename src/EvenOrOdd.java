import java.util.Scanner;

public class EvenOrOdd {

    //return type with parameter
    /*5.create a method that takes an integer as an argument and returns"even" for even
    integers and "odd" for odd integers.*/
    public static boolean isEvenOrOdd (int c) {
        boolean result5 = c % 2 == 0;
        return result5;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("5.Enter number to check if it is odd or even: ");
        if (isEvenOrOdd(scanner.nextInt())) {
            System.out.println("Given Number is even");
        } else {
            System.out.println("Given number is odd ");
        }
    }











}
