import java.util.Scanner;

public class StringHomework {



     //return type with parameter
    //4.create a function that returns true if a string is empty and false otherwise
    public boolean isEmpty(String str1) {

        System.out.println("(4) Enter any String=");
        //Enter the string for to find out if string is empty or not.
          boolean result4 = (str1 == "");
          return result4;



    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringHomework stringHomework = new StringHomework();
        System.out.println("Enter the String : ");
        if  (stringHomework.isEmpty(scanner.next())) {
            System.out.println("Empty String = true");
        } else {
            System.out.println("Not Empty String = false");
        }
    }













}





















































































































