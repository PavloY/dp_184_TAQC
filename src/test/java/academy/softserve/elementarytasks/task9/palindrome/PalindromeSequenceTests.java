package academy.softserve.elementarytasks.task9.palindrome;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Set;
import java.util.TreeSet;

@RunWith(JUnitParamsRunner.class)
public class PalindromeSequenceTests {

  PalindromeSequence palindrome;

  public static Object[][] palindromeTrue(){
    return new Object[][] {
            {"12321"},
            {"1234321"},
            {"1234554321"},
            {"123456654321"},
            {"12345677654321"},
            {"1234567887654321"},
            {"123456789987654321"},
            {"0"},
            {""},
            {"civic"},
            {"repaper"},
            {"I did did I"}
    };
  }

  public static Object[][] palindromeFalse(){
    return new Object[][] {
            {"123"},
            {"321"},
            {"help"},
            {"-123"},
            {"-0"}
    };
  }
  public static Object[][] palindromeFind(){
    return new Object[][] {
            {"11" ,"11"},
            {"1221, 22" ,"1221"},
            {"123321, 2332, 33" ,"123321"},
            {"12344321, 234432, 3443, 44" ,"12344321"},
            {"1234554321, 23455432, 345543, 4554, 55" ,"1234554321"},
            {"123456654321, 2345665432, 34566543, 456654, 5665, 66" ,"123456654321"},
            {"12345677654321, 234567765432, 3456776543, 45677654, 567765, 6776, 77" ,"12345677654321"},
            {"1234567887654321, 23456788765432, 345678876543, 4567887654, 56788765, 678876, 7887, 88" ,"1234567887654321"},
            {"123456789987654321, 2345678998765432, 34567899876543, 456789987654, 5678998765, 67899876, 789987, 8998, 99" ,"123456789987654321"}
    };
  }

  @Before
  public void init (){
    palindrome = new PalindromeSequence();
  }

  @Test
  @Parameters(method = "palindromeTrue")
  public void testIsPalindromeTrue(String input) {

    boolean actual = palindrome.isPalindrome(input);

    Assert.assertTrue(actual);
  }

  @Test
  @Parameters(method = "palindromeFalse")
  public void testIsPalindromeFalse(String input) {

    boolean actual = palindrome.isPalindrome(input);

    Assert.assertFalse(actual);
  }

  @Test
  @Parameters(method = "palindromeFind")
  public void testFindPalindromes(String expect, String input) {
    Set<String> expected = new TreeSet<>();
    expected.add(expect);

    Set<String> actual = palindrome.findPalindromes(input);

    Assert.assertEquals(expected.toString(), actual.toString());
  }

  @After
  public void tearDown(){
    palindrome = null;
  }
}
