import java.util.Scanner;

public class Vowel {

    /*18.write a java program that takes the user to provide a single character   from the alphabet.
        print vowel of consonant,depending on the user input if the user input is not a letter
        (between a and z or A and Z), or is a string of length >1, print an error message.
     */
    public static void vowelOrConsonant() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("18.Enter a single Character to  check if is vowel or consonant:");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
            System.out.println("Input letter is Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Input letter is consonant");
        } else {
            System.out.println("an Error message ");
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vowelOrConsonant();

    }






































}
