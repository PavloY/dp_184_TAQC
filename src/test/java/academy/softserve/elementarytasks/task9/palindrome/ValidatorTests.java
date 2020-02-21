package academy.softserve.elementarytasks.task9.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTests {

  @Test
  public void testValidateInputInt() {
    Validator validator = new Validator("12321");
    Assert.assertEquals(validator.validateInput("12321"), "12321");
  }

  @Test
  public void testValidateInputZero() {
    Validator validator = new Validator("0");
    Assert.assertEquals(validator.validateInput("0"), "0");
  }

  @Test
  public void testValidateInputString() {
    Validator validator = new Validator("String");
    Assert.assertEquals(validator.validateInput("String"), "0");
  }

  @Test
  public void testValidateInputSpace() {
    Validator validator = new Validator(" ");
    Assert.assertEquals(validator.validateInput(" "), "0");
  }

  @Test
  public void testValidateInputDoublePoint() {
    Validator validator = new Validator("11.23");
    Assert.assertEquals(validator.validateInput("11.23"), "11");
  }

  @Test
  public void testValidateInputDoubleComma() {
    Validator validator = new Validator("11,23");
    Assert.assertEquals(validator.validateInput("11,23"), "0");
  }

  @Test
  public void testValidateInputDoubleDash() {
    Validator validator = new Validator("11-23");
    Assert.assertEquals(validator.validateInput("11-23"), "0");
  }

  @Test
  public void testValidateInputDoubleColon() {
    Validator validator = new Validator("11:23");
    Assert.assertEquals(validator.validateInput("11:23"), "0");
  }

  @Test
  public void testValidateInputDoubleMinus() {
    Validator validator = new Validator("-12332");
    Assert.assertEquals(validator.validateInput("-12332"), "-12332");
  }

  @Test
  public void testValidateInputDoubleSlash() {
    Validator validator = new Validator("123/32");
    Assert.assertEquals(validator.validateInput("123/32"), "0");
  }

  @Test
  public void testValidateSet() {
    Validator validator = new Validator("12332");
    Assert.assertEquals(validator.validateSet().toString(), "0");
  }




}









