import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        doStuff();
    }

    static void doStuff(){
        String userInput = null;

        do {
            Envelope envelope1 = ConsoleReader.createEnvelope();
            Envelope envelope2 = ConsoleReader.createEnvelope();
            EnvelopeComparator.compareEnvelopes(envelope1,envelope2);
            System.out.println("Do you want to continue?");
            try {
                userInput = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } while ((userInput.equalsIgnoreCase("y")) || (userInput.equalsIgnoreCase("yes")));
    }
}