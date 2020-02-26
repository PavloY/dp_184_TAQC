package academy.softserve.elementarytasks.task9.palindrome;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.*;
import org.junit.rules.MethodRule;
import org.junit.rules.TestWatchman;
import org.junit.runner.RunWith;
import org.junit.runners.model.FrameworkMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

@RunWith(JUnitParamsRunner.class)
public class ValidatorTests {

  Validator validator;

  static final Logger logger = LoggerFactory.getLogger(ValidatorTests.class);
  @Rule
  public MethodRule watchman = new TestWatchman() {
    public void starting(FrameworkMethod method) {
      logger.info("Run Test {}...", method.getName());
    }

    public void succeeded(FrameworkMethod method) {
      logger.info("Test {} succeeded.", method.getName());
    }

    public void failed(Throwable e, FrameworkMethod method) {
      logger.error("Test {} failed with {}.", method.getName(), e);
    }
  };
  Stack<String> stack;

  public static Object[][] validateInput() {
    return new Object[][]{
            {"11", "11"},
            {"11.11", "11"},
            {"11.23", "11"},
            {"12321", "12321"},
            {"-12332", "12332"},
            {"test", "0"}
    };
  }

  @Before
  public void createEmptyStack() {
    stack = new Stack<String>();
  }

  @Test
  @Parameters(method = "validateInput")
  public void testValidateInput(String input, String expected) {

    validator = new Validator(input);
    String actual = validator.validateInput(null);

    Assert.assertEquals(expected, actual);
  }
}













