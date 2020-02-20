package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Validator {

  public BigInteger convert(String lower) {
    return new BigDecimal(lower).toBigInteger();
  }

  public int convertStringToInt(String lower) {
    return Integer.parseInt(lower);
  }
}
