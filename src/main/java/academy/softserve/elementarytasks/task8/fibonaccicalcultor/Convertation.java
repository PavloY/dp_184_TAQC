package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Convertation {

  public BigInteger convert(String lower) {
    BigInteger lowerTemp = new BigDecimal(lower).toBigInteger();
    return lowerTemp;
  }

  public int convertStringToInt(String lower) {
    int lowerTemp = Integer.parseInt(lower);
    return lowerTemp;
  }
}
