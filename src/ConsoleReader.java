import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ConsoleReader {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int envelopeCounter = 1;
    private static int paramCounter = 1;

    static Envelope createEnvelope() {
        if (envelopeCounter > 2) envelopeCounter = 1;
        double length = readParameterFromConsole();
        double width = readParameterFromConsole();
        envelopeCounter++;
        return new Envelope(length, width);
    }

    private static double readParameterFromConsole() {
        double param = 0;
        String input;
        showInfo();
        try {
            input = reader.readLine();
            if (input.equals("")) throw new NullParameterValueException("Empty string cannot be used as a parameter!");
            param = Double.parseDouble(input);

        } catch (IOException e) {
            System.out.println("IOException occurred");
        } catch (NumberFormatException e) {
            System.out.println("Wrong input type!\nPlease enter only NUMBER");
            System.exit(1);
        } catch (NullParameterValueException e) {
            System.out.println("Empty string cannot be used as a parameter!\nPlease retry and enter a NUMBER");
            System.exit(1);
        }

        return param;
    }

    private static void showInfo(){
        if (paramCounter == 1) {
            System.out.println("Enter length of " + envelopeCounter + " Envelope");
            paramCounter++;
        } else {
            System.out.println("Enter width of " + envelopeCounter + " Envelope");
            paramCounter = 1;
        }
    }
}
