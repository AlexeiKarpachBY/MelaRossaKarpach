package OOP.HW_CreditCard;

import OOP.Exceptions.CardExceptions;

import java.math.BigDecimal;

public class ATM {

    protected Card card;

    public ATM() {}

    public ATM(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void cardReplenishment(double amountOfMoney) {
        card.replenishment(amountOfMoney);
    }

    public void withdrawalFromCard(double amountOfMoney) {
        try {
            card.withdrawal(amountOfMoney);
        } catch (CardExceptions e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "card=" + card +
                '}';
    }


}
