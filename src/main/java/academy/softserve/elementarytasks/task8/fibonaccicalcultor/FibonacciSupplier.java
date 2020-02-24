package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigInteger;
import java.util.ArrayList;

public class FibonacciSupplier {
    private boolean isRangeExist;
    private boolean isLengthExist;
    private BigInteger previousNumbers = new BigInteger("0");
    private BigInteger nextNumbers = new BigInteger("1");
    ArrayList<String> setFibonacci = new ArrayList<String>();


    public ArrayList<String> creatorFibonacci(BigInteger lower, BigInteger upper) {
        boolean isRange;
        do {
            if (isRangeExist(lower, upper)) {
                setFibonacci.add((previousNumbers).toString());
            }
            isRange = (previousNumbers.compareTo(upper) > 0);
            countSequenceFibonacci();
        } while (!isRange);
        return setFibonacci;
    }

    public ArrayList<String> creatorFibonacci(BigInteger length) {
        boolean isLength;
        do {
            if (isLengthExist(length)){
                setFibonacci.add((previousNumbers).toString());
            }
            isLength = (previousNumbers.toString().length() > length.toString().length());
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

    private boolean isRangeExist(BigInteger lower, BigInteger upper) {
        if (((previousNumbers.compareTo(lower) > 0) || (previousNumbers.compareTo(lower) == 0))
                && ((previousNumbers.compareTo(upper) < 0) || (previousNumbers.compareTo(upper) == 0))) {
            isRangeExist = true;
        }
        return isRangeExist;
    }

    private boolean isLengthExist(BigInteger length) {
        if (previousNumbers.toString().length() == length.toString().length()) {
            isLengthExist = true;
        }
        return isLengthExist;
    }


}

