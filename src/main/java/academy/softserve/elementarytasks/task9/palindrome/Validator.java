package academy.softserve.elementarytasks.task9.palindrome;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

public class Validator {
  private static final String ERROR_TEXT = "Incorrect input: You should enter only integers, please try again!\n";
  private String inputValidate;
  private Set<String> setValidate;
  private static ConsoleOutPut print;

  public Validator(Set<String> setValidate) {
    this();
    this.setValidate = setValidate;
  }
  public Validator(String inputValidate) {
    this();
    this.inputValidate = inputValidate;
  }
  private Validator() {
    print = new ConsoleOutPut();
  }

  public String validateInput(String text) {
      try {
        BigInteger inputValid = new BigDecimal(inputValidate).toBigInteger().abs();
        inputValidate = inputValid.toString();
      } catch (NumberFormatException ex) {
        print.showResult(text);
        inputValidate = "0";
      }
    return inputValidate;
  }

  private Set<String> validateSet () {
    if (setValidate.size() < 1) {
      setValidate.add("0");
    }
    return setValidate;
  }

  public Set<String> getValidateSet() {
    return validateSet();
  }

  public String getInputValidate() {
    return validateInput(ERROR_TEXT);
  }
}




