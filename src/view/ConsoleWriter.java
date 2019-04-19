package view;

public class ConsoleWriter {

    public void printException(Exception e) {
        System.out.println(e.getMessage());
    }

    public void printResult(boolean isFit) {
        if (isFit) {
            System.out.println("****************************\n" +
                    "Envelope1 fits in Envelope2\n" +
                    "****************************");
        } else {
            System.out.println("***********************************\n" +
                    "Envelope1 doesn't fit in Envelope2\n" +
                    "***********************************");
        }
    }

    void printMessage(String message) {
        System.out.println(message);
    }
}
