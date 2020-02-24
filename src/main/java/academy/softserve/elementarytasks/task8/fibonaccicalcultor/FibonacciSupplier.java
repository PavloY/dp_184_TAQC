package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigInteger;
import java.util.ArrayList;


public class FibonacciSupplier {

  private boolean isLength = false;
  private boolean isRange = false;
  private BigInteger previousNumbers = new BigInteger("0");
  private BigInteger nextNumbers = new BigInteger("1");
  ArrayList<String> setFibonacci = new ArrayList <String> ();


  public ArrayList<String> creatorFibonacci(BigInteger lower, BigInteger upper) {
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

  public ArrayList<String> creatorFibonacci(BigInteger length) {
    do {
      if (previousNumbers.toString().length() == Integer.parseInt(String.valueOf(length))) {
        setFibonacci.add((previousNumbers).toString());
      }
      isLength = (previousNumbers.toString().length() > Integer.parseInt(String.valueOf(length)));

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
