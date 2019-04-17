package view;

import java.io.BufferedReader;

public class View {

    private BufferedReader reader;

    public View(BufferedReader reader) {
        this.reader = reader;
    }

    public void printException(Exception e) {
        System.out.println(e.getMessage());
    }

    public void printResult(boolean isFit) {
        if (isFit) {
            System.out.println("Envelope1 fits in Envelope2");
        } else {
            System.out.println("Envelope1 doesn't fit in Envelope2");
        }
    }
}
