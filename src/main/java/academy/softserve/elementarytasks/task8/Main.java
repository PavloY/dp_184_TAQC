package academy.softserve.elementarytasks.task8;

import academy.softserve.elementarytasks.task8.fibonaccicalcultor.ConsoleInput;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.Parametr;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.Validator;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.FibonacciSupplier;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.ConsoleOutPut;

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

    switch (validator.convertStrToInt(validator.validateInput(console.scanInput(Parametr.ENTER_NUMBER)))){
      case 1:  output.showFibonacci(fibonacci.creatorFibonacci(
              validator.convertStrToBigInt(validator.validateInput(console.scanInput(Parametr.ENTER_LOWER)))
             ,validator.convertStrToBigInt(validator.validateInput(console.scanInput(Parametr.ENTER_UPPER)))));
        break;
      case 2:  output.showFibonacci(fibonacci.creatorFibonacci(
              validator.convertStrToBigInt(validator.validateInput(console.scanInput(Parametr.ENTER_LENGTH)))));
        break;
      default:
        output.showResult(Parametr.SHOW_ERROR);
        break;
    }
  }
}