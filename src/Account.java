import java.time.*;
import java.util.*;

public class Account {
private double balance;
private HashMap<Integer, Payment> payments = new HashMap<>();



/*
 payments
 1 -> Payment{ìd=1, amount=33.45, date=30-2-2020}
 2 -> Payment{ìd=2, amount=.}
 3 -> Pyamemnt{ìd=3, amount=33}

 get(1) -> Payment{ìd=1}
 get(55) -> null

 addPayment(Payment{ìd=45, amount=56, date=20-3-2020})
 get(45) -> Payment{ìd=45, amount=120, date=20-5-2019}

 */

public void addPayment (Payment inputPayment){


    //System.out.println(inputPayment

    Payment maybePayment = payments.get(inputPayment.uniqueID);
    if(maybePayment != null  ){
        System.out.println("\n"+ inputPayment.uniqueID+"\n This payment ID is already used.\n\n");
    } else {payments.put(inputPayment.uniqueID, inputPayment);
    balance = balance + inputPayment.amount;
    System.out.println("Payment added: \n\n" +inputPayment.toString()+"\n\n Your new balance is "+balance+"\n\n") ;}
    System.out.println(inputPayment.amount);



}
public  HashMap<Integer, Payment>  printPayments(){
    Integer i = 1;
    Double max = 0.00;
    Double min = 0.00;
    Integer minIndex = i;
    Integer maxIndex = i;

    //payments.get(min);
    for (i=1;i<=payments.size();i++){
        if(payments.get(i).amount < min){
            min = payments.get(i).amount;
            minIndex = payments.get(i).uniqueID;
        }
        if (payments.get(i).amount > max){
            max = payments.get(i).amount;
            maxIndex = payments.get(i).uniqueID;
        }
    }

    System.out.println("Highest expense is " + min + "  with ID "+ minIndex);
    System.out.println("Greatest deposit is " + max + "  with ID "+ maxIndex);


    //System.out.println(payments);
    return payments;
}
}
