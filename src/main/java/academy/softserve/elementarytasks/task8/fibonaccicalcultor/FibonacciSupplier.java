package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FibonacciSupplier {
  ConsoleUI console = new ConsoleUI();

    private boolean isLength = false;
    private boolean isRange = false;

    private BigInteger previousNumbers = new BigInteger("0");
    private BigInteger nextNumbers = new BigInteger("1");
    private BigInteger sums = new BigInteger("0");

  public BigInteger convert(int lover) {
    BigInteger loverTemp = new BigDecimal(lover).toBigInteger();
    return loverTemp;
  }

  public void rangeFibonacci(BigInteger lover, BigInteger upper) {

      do {
        if ((previousNumbers.compareTo(lover) == 1 || previousNumbers.compareTo(lover) == 0)
                && (previousNumbers.compareTo(upper) == -1 || previousNumbers.compareTo(upper) == 0)) {
          console.showFibonacci(previousNumbers);
        }
        if (previousNumbers.compareTo(upper) == 1) {
          isRange = true;
        }
        previousNumbers = previousNumbers.add(nextNumbers);
        sums = previousNumbers;
        previousNumbers = nextNumbers;
        nextNumbers = sums;

      } while (!isRange);
    }


  public void lengthFibonacci(BigInteger length) {

   do {
     if (previousNumbers.toString().length() == Integer.parseInt(String.valueOf(length))) {
       console.showFibonacci(previousNumbers);
     }
     if (previousNumbers.toString().length() > Integer.parseInt(String.valueOf(length))) {
       isLength = true;
     }
     previousNumbers = previousNumbers.add(nextNumbers);
     sums = previousNumbers;
     previousNumbers = nextNumbers;
     nextNumbers = sums;

   } while (!isLength);
 }
}
