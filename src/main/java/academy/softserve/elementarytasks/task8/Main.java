package academy.softserve.elementarytasks.task8;

import academy.softserve.elementarytasks.task8.fibonaccicalcultor.ConsoleInput;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.Parametr;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.Validator;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.FibonacciSupplier;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.ConsoleOutPut;

import java.math.BigInteger;

/**
 * 8. Ряд Фибоначчи
 * Вывести все числа Фибоначчи, которые удовлетворяют переданному в функцию ограничению:
 * находятся в указанном диапазоне, либо имеют указанную длину.
 */

public class Main {

    public static void main(String[] args) {

        ConsoleInput console = new ConsoleInput();
        Validator validator = new Validator();
        FibonacciSupplier fibonacci = new FibonacciSupplier();
        ConsoleOutPut output = new ConsoleOutPut();

        switch (getInputCase(console, validator)) {
            case 1:
                output.showFibonacci(fibonacci.creatorFibonacci(
                        getInput(console, validator, Parametr.ENTER_LOWER)
                        , getInput(console, validator, Parametr.ENTER_UPPER)));
                break;
            case 2:
                output.showFibonacci(fibonacci.creatorFibonacci(
                        getInput(console, validator, Parametr.ENTER_LENGTH)));
                break;
            default:
                output.showResult(Parametr.SHOW_ERROR);
                break;
        }
    }

    private static int getInputCase(ConsoleInput console, Validator validator) {
        return validator.convertStrToInt(validator.validateInput(console.scanInput(Parametr.ENTER_NUMBER)));
    }

    private static BigInteger getInput(ConsoleInput console, Validator validator, String text) {
        return validator.convertStrToBigInt(validator.validateInput(console.scanInput(text)));
    }
}