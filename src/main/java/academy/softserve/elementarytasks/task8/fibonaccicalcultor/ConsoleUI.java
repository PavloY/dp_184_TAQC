package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.util.Scanner;

public class ConsoleUI {
  FibonacciSupplier fibonacciSupplier = new FibonacciSupplier();

  public int scanInput(String text) {
    Scanner sc = new Scanner(System.in);
    System.out.println(text);
    return Integer.parseInt(sc.nextLine());
  }

  public void showFibonacci(int lower, int upper) {
    System.out.println(fibonacciSupplier.seriesRangeFibonacci(lower, upper));
  }
  public void showFibonacci(int length) {
    System.out.println(FibonacciSupplier.seriesLengthFibonacci(length));
  }

}
