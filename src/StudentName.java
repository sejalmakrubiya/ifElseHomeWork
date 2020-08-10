import java.util.Scanner;

public class StudentName<Public> {

    /*12.wap to input student name ,roll no,3 subjects marks and find out total, percentage and
        result if he is pass or fail on basis of percentage (pass>=35) and also give them grade
        >80 A+,>=60 A,>50 B,>+35 C.
     */
    //no return type with no parameter
      public static void studentResult() {
        Scanner scanner = new Scanner(System.in);
          System.out.println("12.Enter a student name: ");
          String name = scanner.nextLine();
          System.out.println("12.Enter a student roll no:");
          int rollNo = scanner.nextInt();
          System.out.println("12.Enter the marks for maths,science,english: ");
          int mathsMarks = scanner.nextInt();
          int englishMarks =scanner.nextInt();
          int scienceMarks =scanner.nextInt();
          double total = mathsMarks + englishMarks +scienceMarks;
          double percentage = total / 300 * 100;
          if (percentage >= 35) {
              System.out.println("pass");
          } else {
              System.out.println("fail");
          }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        studentResult();
    }









}
