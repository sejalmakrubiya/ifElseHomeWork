import java.util.Scanner;

public class SalaryBasic {

    /*20.wap input sales id,seller's name,sales amount,salary basic and then find this sales commission
      sales commission("001","john moore",10000) employee 001,john moore's commission is £2000
      >=50,000 35%, >=30000 20%, >=20,000 10%, >=10000 5%, <10,0002%
     */
    public static void salesCommission() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("20.Enter sales id: ");
        String salesId = scanner.next();
        System.out.print("20.Enter seller's name:");
        String sellerName = scanner.next();
        System.out.print("20.Enter sales amount:");
        double salesAmount = scanner.nextDouble();
        if (salesAmount >= 50000) {
            double commission = (salesAmount * 0.35);
            System.out.println(commission);
        } else if (salesAmount >= 30000 && salesAmount < 50000) {
            double commission = (salesAmount * 0.20);
            System.out.println(commission);
        } else if (salesAmount >= 20000 && salesAmount < 3000) {
            double commission = (salesAmount * 0.10);
            System.out.println(commission);
        } else if (salesAmount < 10000) {
            double commission = (salesAmount * 0.02);
            System.out.println(commission);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        salesCommission();

    }


}


























