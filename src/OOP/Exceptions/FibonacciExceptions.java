package OOP.Exceptions;

public class FibonacciExceptions extends MathAlgoritmsManagerExceptions {
    public FibonacciExceptions() {
    }

    public FibonacciExceptions(String message) {
        super(message);
    }

    public FibonacciExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public FibonacciExceptions(Throwable cause) {
        super(cause);
    }

    public FibonacciExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

