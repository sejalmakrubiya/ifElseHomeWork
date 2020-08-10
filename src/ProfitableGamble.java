import java.util.Scanner;

public class ProfitableGamble {

    /*7.create a function that takes in three arguments (prob,prize,pay) and returns true if prob
     *prize>pay;otherwise return false
     */
    //return type with parameter
    public static boolean profitableGamble(float prob, float prize, float pay) {
        boolean result7 = prob * prize > pay;
        return result7;


    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("7. Enter the value for prob : ");
        System.out.print("Enter the value for prize :   ");
        System.out.print("Enter the value for pay   :   ");

        if (profitableGamble(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat()))
        {
            System.out.println("If net profit is >0 = true");
        } else {

        }
    {
        System.out.println("If net profit is <0 = false");


    }


}



















}







