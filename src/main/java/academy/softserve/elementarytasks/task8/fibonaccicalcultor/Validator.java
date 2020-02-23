package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Validator {
  private BigInteger inputValid;
  private BigInteger inputValidInt;

  public int convertStrToInt(String text) {
    try {
      Integer.parseInt(text);
    }catch (NumberFormatException ex) {
      ConsoleOutPut print = new ConsoleOutPut();
      print.showResult(Parametr.SHOW_ERROR);
    }
    return Integer.parseInt(text);
  }

  public BigInteger convertStrToBigInt(String string){
    try {
      inputValid = new BigDecimal(string).toBigInteger();
    }catch (NumberFormatException ex) {
      ConsoleOutPut print = new ConsoleOutPut();
      print.showResult(Parametr.SHOW_ERROR);
    }
    return inputValid;
  }

  public String validateInput(String inputValidate ) {
    try {
      inputValidInt = new BigDecimal(inputValidate).toBigInteger().abs();
    } catch (NumberFormatException ex) {
      ConsoleOutPut print = new ConsoleOutPut();
      print.showResult(Parametr.SHOW_ERROR);
    }
    return inputValidInt.toString();
  }
}
