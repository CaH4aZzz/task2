package exceptions;

public class EmptyStringException extends Exception{

    public EmptyStringException(String msg){
        super(msg);
    }

    @Override
    public String toString() {
        return "EmptyStringException{}";
    }
}
