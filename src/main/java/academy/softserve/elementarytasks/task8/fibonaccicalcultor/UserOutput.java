package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

public class UserOutput {
  FibonacciSupplier fibonacciSupplier = new FibonacciSupplier();

  public void showFibonacci(int lower, int upper) {
    System.out.println(fibonacciSupplier.seriesRangeFibonacci(lower, upper));
  }
  public void showFibonacci(String length) {
    System.out.println(FibonacciSupplier.seriesLengthFibonacci(Integer.parseInt(length)));
  }

}
