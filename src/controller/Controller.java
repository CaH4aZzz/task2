package controller;

import model.MyEnvelope;
import view.ConsoleReader;
import view.ConsoleWriter;

import java.io.IOException;

public class Controller {
    private final static int ENVELOPE_COUNTER = 2;
    private int envelopeCounter = 1;

    private ConsoleReader consoleReader;
    private Validator validator;

    public Controller() {
        consoleReader = new ConsoleReader();
        validator = new Validator();
    }

    public void start() {
        ConsoleWriter consoleWriter = new ConsoleWriter();
        EnvelopeComparator comparator = new EnvelopeComparator();

        String userInput = "y";

        while ((userInput.equalsIgnoreCase("y")) || (userInput.equalsIgnoreCase("yes"))) {
            try {
                MyEnvelope en1 = createEnvelope();
                MyEnvelope en2 = createEnvelope();
                consoleWriter.printResult(comparator.isFit(en1, en2));
            } catch (Exception e) {
                consoleWriter.printException(e);
                if (!(envelopeCounter < 2)) envelopeCounter--;
                continue;
            }
            try {
                userInput = consoleReader.readFromConsole("Do you want to continue?");
            } catch (IOException e) {
                consoleWriter.printException(e);
            }
        }
    }

    private MyEnvelope createEnvelope() throws IOException {
        double length = validator.getValidValue(consoleReader.readFromConsole("Please enter length for Envelope [" + envelopeCounter + "]"));
        double width = validator.getValidValue(consoleReader.readFromConsole("Please enter width for Envelope [" + envelopeCounter + "]"));
        updateAndResetEnvelopeCounter();
        return new MyEnvelope(length, width);
    }

    private void updateAndResetEnvelopeCounter() {
        envelopeCounter++;
        if (envelopeCounter > ENVELOPE_COUNTER) envelopeCounter = 1;
    }
}
