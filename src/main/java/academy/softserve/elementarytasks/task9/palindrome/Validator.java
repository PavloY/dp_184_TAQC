package academy.softserve.elementarytasks.task9.palindrome;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

public class Validator {
  public Validator(String inputValidate) {
    this.inputValidate = inputValidate;
  }
  public Validator(Set<String> setValidate) {
    this.setValidate = setValidate;
  }

  ConsoleOutPut print = new ConsoleOutPut();

  private String inputValidate;
  private Set<String> setValidate;

  public String validateInput() {
      try {
        BigInteger inputValid = new BigDecimal(inputValidate).toBigInteger();
        return inputValid.toString();
      } catch (NumberFormatException ex) {
        print.showResult("Incorrect input: You should enter only integers, please try again!\n");
      }
    return inputValidate;
  }

  public Set<String> validateSet () {
    if (setValidate.size() < 1) {
      setValidate.add("0");
    } else {
      return setValidate;
    }
    return setValidate;
  }

  public Set<String> getSetValidate() {
    if (setValidate == null) {
      setValidate = validateSet() ;
   }
    return setValidate;
  }

  public String getInputValidate() {
      inputValidate = validateInput();
    return inputValidate;
  }
}




