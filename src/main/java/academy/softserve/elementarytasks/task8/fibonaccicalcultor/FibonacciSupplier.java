package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigInteger;
import java.util.ArrayList;

public class FibonacciSupplier {
    private boolean isRangeExist;
    private boolean isLengthExist;
    private boolean isLengthUpper;
    private boolean isRangeTrue;
    private BigInteger previousNumbers = new BigInteger("0");
    private BigInteger nextNumbers = new BigInteger("1");

    public ArrayList<String> creatorFibonacci(BigInteger lower, BigInteger upper) {
        ArrayList<String> setFibonacci = new ArrayList<String>();
        boolean isRange;
        do {
            if (isInTheRange(previousNumbers, lower, upper)) {
                setFibonacci.add((previousNumbers).toString());
            }
            isRange = isRangeTrue(previousNumbers, upper);
            countSequenceFibonacci();
        } while (!isRange);
        return setFibonacci;
    }

    public ArrayList<String> creatorFibonacci(BigInteger length) {
        ArrayList<String> setFibonacci = new ArrayList<String>();
        boolean isLength;
        do {
            if (isInTheLength(previousNumbers, length)){
                setFibonacci.add((previousNumbers).toString());
            }
            isLength = isLengthInRange(previousNumbers, length);
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

    private boolean isInTheRange(BigInteger previousNumbers, BigInteger lower, BigInteger upper) {
        if (((previousNumbers.compareTo(lower) > 0) || (previousNumbers.compareTo(lower) == 0))
                && ((previousNumbers.compareTo(upper) < 0) || (previousNumbers.compareTo(upper) == 0))) {
            isRangeExist = true;
        }
        return isRangeExist;
    }

    private boolean isInTheLength(BigInteger previousNumbers, BigInteger length) {
        if (previousNumbers.toString().length() == length.toString().length()) {
            isLengthExist = true;
        }
        return isLengthExist;
    }

    private boolean isLengthInRange(BigInteger previousNumbers, BigInteger length) {
        if ((previousNumbers.toString().length() > length.toString().length())) {
            isLengthUpper = true;
        }
        return isLengthUpper;
    }

    private boolean isRangeTrue(BigInteger previousNumbers, BigInteger upper) {
        if ((previousNumbers.compareTo(upper) > 0)) {
            isRangeTrue = true;
        }
        return isRangeTrue;
    }
}

