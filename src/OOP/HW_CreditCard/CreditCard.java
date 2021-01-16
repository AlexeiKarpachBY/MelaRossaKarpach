package OOP.HW_CreditCard;

import java.math.BigDecimal;

public class CreditCard extends Card {


    public CreditCard(String cardHolder) {
        super(cardHolder);
    }
    public CreditCard(String cardHolder, double cardBalance) {
        super(cardHolder, cardBalance);
    }

    @Override
    public void withdrawal(double amountOfMoney) {
        cardBalance = cardBalance.subtract(new BigDecimal(amountOfMoney));
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardHolder='" + cardHolder + '\'' +
                ", cardBalance=" + cardBalance +
                '}';
    }

}
