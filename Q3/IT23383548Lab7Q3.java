import java.util.Scanner;

public class IT23383548Lab7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            double total = sc.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = sc.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
                double discount = total * 5 / 100;
                double amount = total - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amount);
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + total);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}