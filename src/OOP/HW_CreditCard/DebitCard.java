package OOP.HW_CreditCard;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String cardHolder) {
        super(cardHolder);
    }
    public DebitCard(String cardHolder, double cardBalance) {
        super(cardHolder, cardBalance);
    }

    @Override
    public void withdrawal(double amountOfMoney) {
        BigDecimal temp = new BigDecimal(amountOfMoney);
        if (cardBalance.subtract(temp).compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("There are not enough funds on the card.");
        } else {
            cardBalance = cardBalance.subtract(temp);
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





