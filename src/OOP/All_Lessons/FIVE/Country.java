package OOP.All_Lessons.FIVE;

public enum Country {
    CANADA,
    POLAND,
    GERMANY;

    String currency;

    Country(String currency) {
        this.currency = currency;
    }

    Country() {

    }
}
