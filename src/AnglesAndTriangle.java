import java.util.Scanner;

public class AnglesAndTriangle {

    /*9.you are  given 2 out of 3 angles in a triangle, in degrees.write a function that classifies
       the missing angles as  either "acute", "right", or obtuse based on its degree
     */
    public static void missingAngles() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("9.Enter a first angle 1:  ");
        int ang1 = scanner.nextInt();
        System.out.print("9.Enter a second angle 2: ");
        int ang2 = scanner.nextInt();
        int ang3 = 180 - ang1 - ang2;
        if (ang3 < 90) {
            System.out.println("Given angle is = An Acute Angle");
        } else if (ang3 == 90) {
            System.out.println("Given angles is = A Right Angle");
        } else {
            System.out.println("Given angles is = An Obtuse Angle");
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        missingAngles();
    }


}






























































