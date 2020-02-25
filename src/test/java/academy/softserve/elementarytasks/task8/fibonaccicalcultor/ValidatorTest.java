package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import academy.softserve.elementarytasks.task9.palindrome.Validator;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

@RunWith(DataProviderRunner.class)
public class ValidatorTest {

  Validator validator;

  @DataProvider
  public static Object[][] fibonacci(){
    return new Object[][] {
            {"12321","12321"},
            {"12321","12321"},
    };
  }

  @Test
  @UseDataProvider("fibonacci")
  public void testValidator(String expected, String input) {

    validator = new Validator(input);
    String actual = validator.validateInput(null);

    Assert.assertEquals(expected, actual);
  }
/*
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

 */

}
