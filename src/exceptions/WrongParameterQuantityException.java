package exceptions;

public class WrongParameterQuantityException extends Exception {

    public WrongParameterQuantityException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "WrongParameterQuantityException{}";
    }
}
