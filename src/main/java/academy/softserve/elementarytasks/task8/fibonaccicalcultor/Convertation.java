package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Convertation {

  public BigInteger convert(int lover) {
    BigInteger loverTemp = new BigDecimal(lover).toBigInteger();
    return loverTemp;
  }
  public BigInteger convert(String lover) {
    BigInteger loverTemp = new BigDecimal(lover).toBigInteger();
    return loverTemp;
  }

  public int convertSrtintToInt (String lover) {
    int loverTemp = Integer.parseInt(lover);
    return loverTemp;
  }
}
