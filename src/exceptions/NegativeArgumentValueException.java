package exceptions;

public class NegativeArgumentValueException extends Exception {

    public NegativeArgumentValueException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "NegativeArgumentValueException{}";
    }
}
