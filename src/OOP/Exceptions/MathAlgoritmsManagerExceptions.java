package OOP.Exceptions;

public class MathAlgoritmsManagerExceptions extends Exception{

    public MathAlgoritmsManagerExceptions() {
    }

    public MathAlgoritmsManagerExceptions(String message) {
        super(message);
    }

    public MathAlgoritmsManagerExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public MathAlgoritmsManagerExceptions(Throwable cause) {
        super(cause);
    }

    public MathAlgoritmsManagerExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
