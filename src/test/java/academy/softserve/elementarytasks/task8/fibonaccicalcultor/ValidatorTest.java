package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class ValidatorTest {

  Validator validator = new Validator();

  @Test
  public void testValidatorInt() {
    Assert.assertEquals(validator.validateInput("12321"), "12321");
  }

  @Test
  public void testValidatorMinus() {
    Assert.assertEquals(validator.validateInput("-12321"), "12321");
  }

  @Test
  public void testConvertStrToBigInt() {
    Assert.assertEquals(validator.convertStrToBigInt("12321"), new BigInteger("12321"));
  }

  @Test
  public void testConvertStrToInt() {
    Assert.assertEquals(validator.convertStrToInt("12321"), 12321);
  }

}
