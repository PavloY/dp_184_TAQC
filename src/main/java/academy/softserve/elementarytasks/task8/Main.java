package academy.softserve.elementarytasks.task8;

import academy.softserve.elementarytasks.task8.fibonaccicalcultor.ConsoleUI;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.FibonacciSupplier;


public class Main {

  public static void main(String[] args) {

    ConsoleUI console = new ConsoleUI();
    FibonacciSupplier fibonacci = new FibonacciSupplier();

    switch (console.scanInput("This program will show the Fibonacci series \n" +
            "select type (1) - range (2) - length:")) {
      case 1:
        fibonacci.rangeFibonacci(fibonacci.convert(console.scanInput("lover"))
                , fibonacci.convert(console.scanInput("upper")));
        break;
      case 2:
        fibonacci.lengthFibonacci(fibonacci.convert(console.scanInput("length")));
        break;
    }
  }
}
