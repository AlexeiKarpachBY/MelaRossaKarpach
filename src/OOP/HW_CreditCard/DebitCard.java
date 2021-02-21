package OOP.HW_CreditCard;

import OOP.Exceptions.CardExceptions;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String cardHolder) {
        super(cardHolder);
    }
    public DebitCard(String cardHolder, double cardBalance) {
        super(cardHolder, cardBalance);
    }

    @Override
    public void withdrawal(double amountOfMoney)throws CardExceptions {

        if (cardBalance.subtract(new BigDecimal(amountOfMoney)).compareTo(BigDecimal.ZERO) < 0) {
            throw new CardExceptions("There are not enough funds on the card.");
        }
        else {
            cardBalance = cardBalance.subtract(new BigDecimal(amountOfMoney));
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "cardHolder='" + cardHolder + '\'' +
                ", cardBalance=" + cardBalance +
                '}';
    }

}





