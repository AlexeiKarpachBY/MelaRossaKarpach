package OOP.HW_CreditCard;

import OOP.Exceptions.CardExceptions;

import java.math.BigDecimal;
import java.math.RoundingMode;

 public abstract class Card {

    protected String cardHolder;
    protected BigDecimal cardBalance = BigDecimal.ZERO;

    public Card(String cardHolder) {
        this.cardHolder = cardHolder;
    }
    public Card(String cardHolder, double cardBalance) {
        this.cardHolder = cardHolder;
        this.cardBalance = new BigDecimal(cardBalance);
    }

    public String getCardHolder() {
        return cardHolder;
    }
    public BigDecimal getCardBalance() {
        return cardBalance;
    }
    public BigDecimal getCardBalanceInUSD() {
        BigDecimal exchangeRates = new BigDecimal("2.5891");
        return cardBalance.divide(exchangeRates,3,RoundingMode.HALF_UP);
    }


    public void replenishment(double amountOfMoney) {
        cardBalance = cardBalance.add(new BigDecimal(amountOfMoney));
    }
    public abstract void withdrawal(double amountOfMoney) throws CardExceptions;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;
        Card that = (Card) obj;
        if (!cardHolder.equals(that.cardHolder)) return false;
        return cardBalance.compareTo(that.cardBalance) == 0;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + cardHolder.hashCode();
        result = 31 * result + cardBalance.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardHolder='" + cardHolder + '\'' +
                ", cardBalance=" + cardBalance +
                '}';
    }
}

