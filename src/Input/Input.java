package Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface Input {
    static String inputString(String message){
        Scanner input = new Scanner(System.in);
        String line;
        try {
            System.out.println(message);
            line = input.nextLine();
            if (line.isEmpty()){
                throw new NullPointerException();
            }
        }   catch (NullPointerException e){
            System.out.println("Incorrect input. Enter a non-empty string.");
            line = inputString(message);
        }

        return line;
    }

    static int inputInteger(String message){
        Scanner input = new Scanner(System.in);
        int number = 0;
        try {
            System.out.println(message);
            number = input.nextInt();
            if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE){
                throw new InputMismatchException();
            }
        }   catch (InputMismatchException e) {
            System.out.println("Incorrect input. Enter an integer.");
            number = inputInteger(message);
        }
        return number;
    }

    static float inputDouble(String message) {
        Scanner input = new Scanner(System.in);
        float number;
        try {
            System.out.println(message);
            number = input.nextFloat();
            if (number > Double.MAX_VALUE || number < Double.MIN_VALUE) {
                throw new InputMismatchException();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("\n          Incorrect input. Enter the number.\n");
            number = inputDouble(message);
        }
        return number;
    }
}
