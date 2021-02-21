package OOP.HW_CreditCard;


public class Main {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard("Alex", 100);
        DebitCard debitCard1 = new DebitCard("Alex", 100);
        ATM atm = new ATM();

        atm.setCard(debitCard);
        atm.withdrawalFromCard(50);
        atm.setCard(debitCard1);
        atm.withdrawalFromCard(30);

        System.out.println(debitCard.getCardBalance());
        System.out.println(debitCard1.getCardBalance());


    }
}
