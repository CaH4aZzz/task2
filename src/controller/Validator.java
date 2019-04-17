package controller;

import exceptions.EmptyStringException;
import exceptions.NegativeArgumentValueException;
import exceptions.WrongParameterQuantityException;

public class Validator {

    public double validate(String userInput) throws WrongParameterQuantityException, EmptyStringException, IllegalArgumentException, NegativeArgumentValueException {

        double param;
        if (userInput == null) {
            throw new NullPointerException();
        }

        try {
            param = Double.parseDouble(userInput);
            if (param < 0)
                throw new NegativeArgumentValueException("Negative number cannot be used as as parameter\nPlease enter positive number");
        } catch (NumberFormatException e) {
            throw e;
        }
        return param;
    }
}
