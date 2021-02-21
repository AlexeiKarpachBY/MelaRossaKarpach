package OOP.Exceptions;

public class FactorialExceptions extends MathAlgoritmsManagerExceptions {
    public FactorialExceptions() {
    }

    public FactorialExceptions(String message) {
        super(message);
    }

    public FactorialExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public FactorialExceptions(Throwable cause) {
        super(cause);
    }

    public FactorialExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
