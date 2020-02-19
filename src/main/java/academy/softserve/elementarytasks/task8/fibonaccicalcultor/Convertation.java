package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Convertation {

  public BigInteger convert(String lover) {
    BigInteger lowerTemp = new BigDecimal(lover).toBigInteger();
    return lowerTemp;
  }

  public int convertStringToInt(String lover) {
    int lowerTemp = Integer.parseInt(lover);
    return lowerTemp;
  }
}
