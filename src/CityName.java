import java.util.Scanner;

public class CityName {

    /*16.input any alphabet from a to f and print their city name accordingly (use if else )
         any other alphabet should be invalid entry
     */
     public static void cityName() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("16. Enter any alphabet from a to f to print their city name: ");
         String cityName = scanner.next();
         if (cityName.equals("a")) {
             System.out.println("Ahmadabad");
         } else if (cityName.equals("b")) {
             System.out.println("Baroda");
         } else if (cityName.equals("c")) {
             System.out.println("Chin");
         } else if (cityName.equals("d")) {
             System.out.println("Delhi");
         } else if (cityName.equals("e")) {
             System.out.println("Egypt");
         } else if (cityName.equals("f")) {
             System.out.println("Florida");
         } else {
             System.out.println("invalid entry");
         }
     }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cityName();
    }

































}
