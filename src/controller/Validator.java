package controller;


public class Validator {

    public double getValidValue(String userInput) throws IllegalArgumentException {

        double param;
        if (userInput.equals(""))
            throw new IllegalArgumentException("Empty string cannot be used as a parameter!");
        try {
            param = Double.parseDouble(userInput);
            if (param < 0)
                throw new IllegalArgumentException("Negative number \"" + userInput + "\" cannot be used as as parameter\nPlease enter only 1 positive number");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Line \"" + userInput + "\" cannot be used as a parameter\nPlease enter only 1 positive number");
        }
        return param;
    }
}
