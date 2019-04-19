package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    private final static ConsoleWriter writer = new ConsoleWriter();
    private static BufferedReader reader;

    public ConsoleReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readFromConsole(String message) throws IOException {
        writer.printMessage(message);
        String param;
        try {
            param = reader.readLine();
        } catch (IOException e) {
            throw new IOException("IOException occurred while reading from console");
        }
        return param;
    }
}
