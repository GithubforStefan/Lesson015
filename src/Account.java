import java.time.*;
import java.util.*;

public class Account {
    final java.text.DecimalFormat twoDigits = new java.text.DecimalFormat( "0.00" );
    private double balance;
    private HashMap<Integer, Payment> payments = new HashMap<>();

    public void addPayment(Payment inputPayment) {


        //checking payment IDs for duplicates
        Payment maybePayment = payments.get(inputPayment.uniqueID);
        if (maybePayment != null) {
            System.out.println("\n" + inputPayment.uniqueID + "\n This payment ID is already used.\n\n");
        } else {
            payments.put(inputPayment.uniqueID, inputPayment);
            balance = balance + inputPayment.getAmount();
            System.out.println("Payment added: \n\n" + inputPayment.toString() + "\n\n Your new balance is " + twoDigits.format(balance) + "\n\n");
        }
        System.out.println(twoDigits.format(inputPayment.getAmount()));


    }

    public HashMap<Integer, Payment> printPayments() {


        //finding the highest expense and the highest deposit
        Integer i = 1;
        double max = 0.00;
        double min = 0.00;
        Integer minIndex = i;
        Integer maxIndex = i;

        for (i = 1; i <= payments.size(); i++) {
            if (payments.get(i).getAmount() < min) {
                min = payments.get(i).getAmount();
                minIndex = payments.get(i).uniqueID;
            }
            if (payments.get(i).getAmount() > max) {
                max = payments.get(i).getAmount();
                maxIndex = payments.get(i).uniqueID;
            }
        }

        System.out.println("Highest expense is " + twoDigits.format(min) + "  with ID " + minIndex);
        System.out.println("Greatest deposit is " + twoDigits.format(max) + "  with ID " + maxIndex);

        //calculating total expenses and total deposits

        double sumExpenses = 0.00;
        double sumDeposits = 0.00;
        for (i = 1;i<=payments.size();i++){
            if(payments.get(i).getAmount()<0.00){
                sumExpenses = sumExpenses+payments.get(i).getAmount();
            }
            if (payments.get(i).getAmount()>0.00){
                sumDeposits = sumDeposits+payments.get(i).getAmount();}
        }
        System.out.println("You have spent a total of " + twoDigits.format(sumExpenses));
        System.out.println("You have deposited a total of " + twoDigits.format(sumDeposits));

        //calculating totals by payment type
        Integer m;

        //String expenseCategory;
        Scanner expenseType = new Scanner(System.in);
        System.out.println("\n\n Please enter an expense type: ");
        String expType = expenseType.nextLine();
        double sumExpensesByType = 0.00;

        for (m = 1; m <=payments.size();m++){
            if(payments.get(m).getAmount()<0.00){
                if(Objects.equals(payments.get(m).type, expType)){
                    //String expenseCategory = expType;
                    sumExpensesByType = sumExpensesByType+payments.get(m).getAmount();

                }
            }
        }
        System.out.println("You have spent a total of " + twoDigits.format(sumExpensesByType) + " for " + expType + ".");
/*
        i = 1;
        sumExpensesByType = 0.00;
        expenseCategory = null;

        for (i = 1; i <=payments.size();i++){
            if(payments.get(i).getAmount()<0.00){
                if(payments.get(i).type == "Sweets"){
                    expenseCategory = "Sweets";
                    sumExpensesByType = sumExpensesByType+payments.get(i).getAmount();
                }
            }
        }
        System.out.println("You have spent a total of " + twoDigits.format(sumExpensesByType) + " for " + expenseCategory + ".");

        i = 1;
        sumExpensesByType = 0.00;
        expenseCategory = null;

        for (i = 1; i <=payments.size();i++){
            if(payments.get(i).getAmount()<0.00){
                if(payments.get(i).type == "Rent"){
                    expenseCategory = "Rent";
                    sumExpensesByType = sumExpensesByType+payments.get(i).getAmount();
                }
            }
        }
        System.out.println("You have spent a total of " + twoDigits.format(sumExpensesByType) + " for " + expenseCategory + ".");
*/

        return payments;
    }

}
