public class HoechsteAusgabe {



    public static double Zahlung(Account newAccount, Payment x, double v) {
        double hoechsteausgabe = v;
        newAccount.addPayment(x);
        if (x.amount < hoechsteausgabe){
            hoechsteausgabe = x.amount;
            System.out.println("Deine hoechste ausgabe ist"+hoechsteausgabe);
        }
        return  hoechsteausgabe;
    }
}
