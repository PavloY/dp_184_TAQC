package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigInteger;
import java.util.ArrayList;

public class FibonacciSupplier {

    private BigInteger previousNumbers = new BigInteger("0");
    private BigInteger nextNumbers = new BigInteger("1");
    ArrayList<String> setFibonacci = new ArrayList<String>();

    public ArrayList<String> creatorFibonacci(BigInteger lower, BigInteger upper) {
        boolean isRange = false;
        do {
            if ((previousNumbers.compareTo(lower) == 1 || previousNumbers.compareTo(lower) == 0)
                    && (previousNumbers.compareTo(upper) == -1 || previousNumbers.compareTo(upper) == 0)) {
                setFibonacci.add((previousNumbers).toString());
            }
            isRange = (previousNumbers.compareTo(upper) == 1);
            countSequenceFibonacci();
        } while (!isRange);
        return setFibonacci;
    }

    public ArrayList<String> creatorFibonacci(BigInteger length) {
        boolean isLength = false;
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
