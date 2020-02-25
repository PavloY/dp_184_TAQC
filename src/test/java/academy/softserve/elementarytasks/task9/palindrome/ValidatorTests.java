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
  @Rule public MethodRule watchman = new TestWatchman() {
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
            {"11" ,"11"},
            {"12321", "12321"},
            {" ", "0"},
            {"11.23", "11"},
            {"11,23", "0"},
            {"11-23", "0"},
            {"11:23", "0"},
            {"-12332", "12332"},
            {"123/32", "0"}
    };
  }

  public static Object[][] validateSet() {
    return new Object[][]{
            {"11111" ,"11111"}
    };
  }

  @Before
  public void createEmptyStack (){
    stack = new Stack<String>();
  }

  @Test
  @Parameters(method = "validateInput")
  public void testValidateInput(String input, String expected) {

    validator = new Validator(input);
    String actual = validator.validateInput(null);

    Assert.assertEquals(expected, actual);
  }


  @Test
  @Parameters(method = "validateSet")
  public void testValidateSet(String expect, Set<String> input) {
    Set<String> expected = new HashSet<String>();;
    expected.add(expect);

    validator = new Validator(input);
    Set<String> actual = validator.validateSet();;

    Assert.assertEquals(expected, actual);
  }
/*
 public void testFindPalindromes(String expect, String input) {
    Set<String> expected = new TreeSet<>();
    expected.add(expect);

    Set<String> actual = palindrome.findPalindromes(input);

    Assert.assertEquals(expected.toString(), actual.toString());
  }









  @Test
  public void testValidateSetInt() {
    Set<String> setA = new HashSet<String>();;
    setA.add("123");
    Validator validator = new Validator(setA);
    Assert.assertEquals(validator.validateSet().toString(), "[123]");
  }

  @Test
  public void testValidateSetZero() {
    Set<String> setA = new HashSet<String>();;
    setA.add("0");
    Validator validator = new Validator(setA);
    Assert.assertEquals(validator.validateSet().toString(), "[0]");
  }

  @Test
  public void testValidateSetNoPalindrome() {
    Set<String> setA = new HashSet<String>();;
    Validator validator = new Validator(setA);
    Assert.assertEquals(validator.validateSet().toString(), "[0]");
  }

  @Test
  public void testGetValidateSet() {
    Set<String> setA = new HashSet<String>();;
    setA.add("123321");
    Validator validator = new Validator(setA);
    Assert.assertEquals(validator.getValidateSet().toString(), "[123321]");
  }
 */
}











