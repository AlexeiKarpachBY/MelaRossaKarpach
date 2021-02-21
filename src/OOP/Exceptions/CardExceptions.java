package OOP.Exceptions;

public class CardExceptions extends Exception {
    public CardExceptions() {
    }

    public CardExceptions(String message) {
        super(message);
    }

    public CardExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public CardExceptions(Throwable cause) {
        super(cause);
    }

    public CardExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
