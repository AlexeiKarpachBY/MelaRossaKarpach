package OOP.HW_CreditCard;

import java.math.BigDecimal;

public class ATM {

    protected Card card;

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
        card.withdrawal(amountOfMoney);
    }

    @Override
    public String toString() {
        return "ATM{" +
                "card=" + card +
                '}';
    }


}
