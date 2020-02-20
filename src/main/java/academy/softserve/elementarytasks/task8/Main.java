package academy.softserve.elementarytasks.task8;

import academy.softserve.elementarytasks.task8.fibonaccicalcultor.ConsoleInput;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.ConsoleOutput;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.Validator;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.FibonacciSupplier;

/**
 * 8. Ряд Фибоначчи
 * Вывести все числа Фибоначчи, которые удовлетворяют переданному в функцию ограничению:
 * находятся в указанном диапазоне, либо имеют указанную длину.
 */

public class Main {

  public static void main(String[] args) {

    ConsoleInput console = new ConsoleInput();
    FibonacciSupplier fibonacci = new FibonacciSupplier();
    Validator validator = new Validator();
    ConsoleOutput consoleOutput = new  ConsoleOutput();

    switch (validator.convertStringToInt(console.scanInput("This program will show the Fibonacci series \n" +
            "select type (1) - range (2) - length:"))) {
      case 1:
        fibonacci.creatorFibonacci(validator.convert(console.scanInput("lover"))
                , validator.convert(console.scanInput("upper")));
        break;
      case 2:
        fibonacci.creatorFibonacci(validator.convert(console.scanInput("length")));
        break;
      default:
        consoleOutput.showResult("Incorrect input!");
        break;
    }
    }
  }

