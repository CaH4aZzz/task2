package controller;

import exceptions.EmptyStringException;
import exceptions.NegativeArgumentValueException;
import exceptions.NullParameterValueException;
import exceptions.WrongParameterQuantityException;
import model.MyEnvelope;
import view.ConsoleReader;
import view.View;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controller {
    private int envelopeCounter = 1;
    private final int ENVELOPE_COUNTER = 2;
    Validator validator = new Validator();

    public void start() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        View view = new View(reader);
        String userInput = "";

        do {
            try {
                MyEnvelope en1 = createEnvelope();
                MyEnvelope en2 = createEnvelope();
                view.printResult(EnvelopeComparator.compareEnvelopes(en1, en2));
            } catch (Exception e) {
                view.printException(e);
            }

            try {
                userInput = ConsoleReader.readFromConsole("Do you want to continue?");
            } catch (NullParameterValueException e) {
                view.printException(e);
            }
        } while ((userInput.equalsIgnoreCase("y")) || (userInput.equalsIgnoreCase("yes")));
    }

    private MyEnvelope createEnvelope() throws NullParameterValueException, WrongParameterQuantityException, EmptyStringException, NegativeArgumentValueException {
        double length = validator.validate(ConsoleReader.readFromConsole("Please enter length for Envelope [" + envelopeCounter + "]"));
        double width = validator.validate(ConsoleReader.readFromConsole("Please enter width for Envelope [" + envelopeCounter + "]"));
        updateAndResetEnvelopeCounter();
        return new MyEnvelope(length, width);
    }

    private void updateAndResetEnvelopeCounter() {
        envelopeCounter++;
        if (envelopeCounter > ENVELOPE_COUNTER) envelopeCounter = 1;
    }
}
