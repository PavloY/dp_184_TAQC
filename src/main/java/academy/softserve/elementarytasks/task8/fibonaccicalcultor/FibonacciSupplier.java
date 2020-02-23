package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;


public class FibonacciSupplier {

  private Set<String> setFibonacci;
  private boolean isLength = false;
  private boolean isRange = false;
  private BigInteger previousNumbers = new BigInteger("0");
  private BigInteger nextNumbers = new BigInteger("1");



  public Set<String> creatorFibonacci(BigInteger lower, BigInteger upper) {
    setFibonacci = new HashSet<>();
    do {
      if ((previousNumbers.compareTo(lower) == 1 || previousNumbers.compareTo(lower) == 0)
              && (previousNumbers.compareTo(upper) == -1 || previousNumbers.compareTo(upper) == 0)) {
        setFibonacci.add((previousNumbers).toString());
      }
      if (previousNumbers.compareTo(upper) == 1) {
        isRange = true;
      }
      countSequenceFibonacci();
    } while (!isRange);
    return setFibonacci;
  }

  public Set<String> creatorFibonacci(BigInteger length) {
    setFibonacci = new HashSet<>();
    do {
      if (previousNumbers.toString().length() == Integer.parseInt(String.valueOf(length))) {
        setFibonacci.add((previousNumbers).toString());
      }
      if (previousNumbers.toString().length() > Integer.parseInt(String.valueOf(length))) {
        isLength = true;
      }
      countSequenceFibonacci();
    } while (!isLength);
    return setFibonacci;
  }

  private void countSequenceFibonacci() {
    previousNumbers = previousNumbers.add(nextNumbers);
    BigInteger sums = previousNumbers;
    previousNumbers = nextNumbers;
    nextNumbers = sums;
  }
}
