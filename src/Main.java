import java.time.*;
import java.util.*;

public class Main {



    public static void main(String[] args) {

        double v = 0;

        double min;



        Payment newPayment1 = new Payment(1, -223.34, "Groceries", LocalDate.now() );
        Payment newPayment2 = new Payment(2, -23.34, "Transport", LocalDate.now() );
        Payment newPayment3 = new Payment(3, -25.70, "Power", LocalDate.now() );
        Payment newPayment4 = new Payment(4, -826.34, "Rent", LocalDate.now() );
        Payment newPayment5 = new Payment(5, -956.67,"Sweets",LocalDate.now());
        Payment newDeposit1 = new Payment(6, +1000,"Deposit", LocalDate.now());



        Account newAccount = new Account();
        //HoechsteAusgabe.Zahlung(newAccount, newPayment1, v) ;

        //HoechsteAusgabe.Zahlung(newAccount, newPayment2, v);
        newAccount.addPayment(newPayment1);
        newAccount.addPayment(newPayment2);
        newAccount.addPayment(newPayment3);
        newAccount.addPayment(newPayment4);
        newAccount.addPayment(newPayment5);
        newAccount.addPayment(newDeposit1);

/*
        int i;
        for (i=1;i<newAccount.;i++){
            System.out.println();}
*/






        //System.out.println(newPayment1.amount < newPayment2.amount);
        //
        // System.out.println(newPayment1.getAmount());
        //System.out.println(newAccount.toString());
newAccount.printPayments();

            }


}
