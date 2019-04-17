package view;

import exceptions.NullParameterValueException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readFromConsole(String message) throws NullParameterValueException {
        System.out.println(message);
        String param = "";
        try {
            param = reader.readLine();
            if (param.equals("")) throw new NullParameterValueException("Empty string cannot be used as a parameter!");

        } catch (IOException e) {
            System.out.println("IOException occurred");
        }

        return param;
    }
}
