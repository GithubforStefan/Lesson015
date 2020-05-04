import java.time.*;

// TODO: 29.04.2020 Today we will work for a Bank 🏦.
//  Our bank wants to implement a new feature for our users.
//  Our users would like to get Statistics where do they spend money and how much.
//  The bank stores information about different payment.
//  Each Payment has a unique id, amount, type (for example groceries 🍅 , entertainment 🎥 , cafes 🍹 , house holding 🏠 ,
//  transport 🚌 ...) and month and year when the payment happened.
//  Our users want to get statistics what was the most expensive payment, what was the biggest income that they got,
//  how much they spend and earned in total and how much they paid for each type of the payment.
//#
//Let's start with structures
public class Payment {
    int uniqueID;
    private double amount;
    String type;
    LocalDate date;

    public Payment(int uniqueID, double amount, String type, LocalDate date) {
        this.uniqueID = uniqueID;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }


    public double getAmount() {
        return amount;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Payment{" +
                "uniqueID=" + uniqueID +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
