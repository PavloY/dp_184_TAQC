package academy.softserve.elementarytasks.task8.fibonaccicalcultor;



import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class ValidatorTest {

  Validator validator;

  @DataProvider
  public static Object[][] validateInput(){
    return new Object[][] {
            {"12321","12321"},
            {"12321","-12321"},
            {"12345678901234567890123456789012345678901234567890","12345678901234567890123456789012345678901234567890"},
            {"12345678901234567890123456789012345678901234567890","-12345678901234567890123456789012345678901234567890"}
    };
  }

  @Before
  public void init (){
    validator = new Validator();
  }

  @Test
  @UseDataProvider("validateInput")
  public void testValidator(String expected, String input) {

    String actual = validator.validateInput(input);

    Assert.assertEquals(expected, actual);
  }

  @After
  public void tearDown(){
    validator = null;
  }

}
