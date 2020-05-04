import java.time.*;
import java.util.*;

public class Main {

    public static void main(final java.lang.String[] args) {
        final java.text.DecimalFormat twoDigits = new java.text.DecimalFormat( "0.00" );
        Scanner insertPaymentID = new Scanner(System.in);
        System.out.println("Please insert a payment ID ");
        int newID = insertPaymentID.nextInt();
        Scanner insertPaymentAmount = new Scanner(System.in);
        System.out.println("Please insert the amount in format -###,## (expenses) and ###,## (deposits): ");
        Double newAmount = insertPaymentAmount.nextDouble();
        Scanner insertPaymentType = new Scanner(System.in);
        System.out.println("And don't forget to specify a payment type: ");
        String newType = insertPaymentType.nextLine();

        LocalDate newDate = LocalDate.now();
        Payment newPayment = new Payment(newID, newAmount,newType,newDate);



        Payment newPayment1 = new Payment(1, -223.34, "Groceries", LocalDate.now());
        Payment newPayment2 = new Payment(2, -23.34, "Transport", LocalDate.now());
        Payment newPayment3 = new Payment(3, -25.70, "Power", LocalDate.now());
        Payment newPayment4 = new Payment(4, -826.34, "Rent", LocalDate.now());
        Payment newPayment5 = new Payment(5, -956.67, "Sweets", LocalDate.now());
        Payment newDeposit1 = new Payment(6, +1000, "Deposit", LocalDate.now());
        Payment newPayment6 = new Payment(7, -826.34, "Rent", LocalDate.now());
        Payment newPayment7 = new Payment(8, -96.67, "Sweets", LocalDate.now());
        Payment newPayment8 = new Payment(9, -3.50, "Transport", LocalDate.now());
        Payment newPayment9 = new Payment(10, -25.70, "Power", LocalDate.now());
        Payment newPayment10 = new Payment(11, -2.98, "Groceries", LocalDate.now());
        Payment newDeposit2 = new Payment(12, +2000, "Deposit", LocalDate.now());

        Account newAccount = new Account();

        newAccount.addPayment(newPayment);
        newAccount.addPayment(newPayment1);
        newAccount.addPayment(newPayment2);
        newAccount.addPayment(newPayment3);
        newAccount.addPayment(newPayment4);
        newAccount.addPayment(newPayment5);
        newAccount.addPayment(newDeposit1);
        newAccount.addPayment(newPayment6);
        newAccount.addPayment(newPayment7);
        newAccount.addPayment(newPayment8);
        newAccount.addPayment(newPayment9);
        newAccount.addPayment(newPayment10);
        newAccount.addPayment(newDeposit2);

        newAccount.printPayments();
        System.out.println("Would you like to add another expense or deposit? (y/n)");
        Scanner yesOrNo = new Scanner(System.in);
        String yesNo = yesOrNo.nextLine();
        if (yesNo.equals("n")) {
            System.out.println("Thank you for using this software. Bye!");
                    }
        else {
            System.out.println("Please insert a payment ID ");
            newID = insertPaymentID.nextInt();
            System.out.println("Please insert the amount in format -###,## (expenses) and ###,## (deposits): ");
            newAmount = insertPaymentAmount.nextDouble();

        }

    }


}
