package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigInteger;

public class FibonacciSupplier {
  ConsoleOutput consoleOutput = new  ConsoleOutput();

    private boolean isLength = false;
    private boolean isRange = false;

    private BigInteger previousNumbers = new BigInteger("0");
    private BigInteger nextNumbers = new BigInteger("1");
    private BigInteger sums = new BigInteger("0");

  public void creatorFibonacci(BigInteger lover, BigInteger upper) {
      do {
        if ((previousNumbers.compareTo(lover) == 1 || previousNumbers.compareTo(lover) == 0)
                && (previousNumbers.compareTo(upper) == -1 || previousNumbers.compareTo(upper) == 0)) {
          consoleOutput.showFibonacci(previousNumbers);
        }
        if (previousNumbers.compareTo(upper) == 1) {
          isRange = true;
        }
        countFibo(previousNumbers);
      } while (!isRange);
    }

  public void creatorFibonacci(BigInteger length) {
   do {
     if (previousNumbers.toString().length() == Integer.parseInt(String.valueOf(length))) {
       consoleOutput.showFibonacci(previousNumbers);
     }
     if (previousNumbers.toString().length() > Integer.parseInt(String.valueOf(length))) {
       isLength = true;
     }
     countFibo(previousNumbers);
   } while (!isLength);
 }

  private BigInteger countFibo(BigInteger previousNumbers) {
    this.previousNumbers = this.previousNumbers.add(nextNumbers);
    sums = this.previousNumbers;
    this.previousNumbers = nextNumbers;
    nextNumbers = sums;
    return previousNumbers;

  }
}
