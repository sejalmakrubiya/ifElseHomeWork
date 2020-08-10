import java.util.Scanner;

public class JanuaryToDecember {

 //19.wap that takes the user provided number 1 to 12 and output should be month i.e. january
 public static void monthName () {
     Scanner scanner = new Scanner(System.in);
     System.out.print("19. Enter number 1 to 12 to find out Month Name: ");
     int number1to12 = scanner.nextInt();
     if (number1to12 == 1) {
         System.out.println("This month is January");
     } else if (number1to12 == 2) {
         System.out.println("This month is February");
     } else if (number1to12 == 3) {
         System.out.println("This month is March");
     } else if (number1to12 == 4) {
         System.out.println("This month is April");
     } else if (number1to12 == 5) {
         System.out.println("This month is May");
     } else if (number1to12 == 6) {
         System.out.println("This month is June");
     } else if (number1to12 == 7) {
         System.out.println("This month is July");
     } else if (number1to12 == 8) {
         System.out.println("This month is August");
     } else if (number1to12 == 9) {
         System.out.println("This month is September");
     } else if (number1to12 == 10) {
         System.out.println("This month is October");
     } else if (number1to12 == 11) {
         System.out.println("This month is November");
     } else if (number1to12 == 12) {
         System.out.println("This month is December");
     } else {
         System.out.println("This is not a Month");
     }


 }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        monthName();
    }































}
