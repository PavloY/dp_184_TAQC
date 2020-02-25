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
            {"0"},
            {""},
            {"civic"}
    };
  }

  public static Object[][] palindromeFalse(){
    return new Object[][] {
            {"123"},
            {"321"},
            {"help"},
            {"-123"}
    };
  }

  @Before
  public void init (){
    palindrome = new PalindromeSequence();
  }
  @After
  public void tearDown(){
    palindrome = null;
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
  @Parameters({
        "11,11",
        "12321, 12321"
  })
  public void testFindPalindromes(String expect, String input) {
    Set<String> expected = new TreeSet<>();
    expected.add(expect);

    Set<String> actual = palindrome.findPalindromes(input);

    Assert.assertEquals(expected, actual);
  }



/*
  @Test
  public void testFindPalindromesTwo() {
    Assert.assertEquals(palindrome.findPalindromes("12321").toString(), "[12321, 232]");
  }

  @Test
  public void testFindPalindromesThree() {
    Assert.assertEquals(palindrome.findPalindromes("1234321").toString(), "[1234321, 23432, 343]");
  }

  @Test
  public void testGetPalindromesThree() {
    PalindromeSequence palindrome = new PalindromeSequence("123321");
    Assert.assertEquals(palindrome.getPalindromes().toString(), "[123321, 2332, 33]");
  }

  @Test
  public void testGetPalindromesZero() {
    PalindromeSequence palindrome = new PalindromeSequence("0");
    Assert.assertEquals(palindrome.getPalindromes().toString(), "[]");
  }

  @Test
  public void testGetPalindromesSpace() {
    PalindromeSequence palindrome = new PalindromeSequence(" ");
    Assert.assertEquals(palindrome.getPalindromes().toString(), "[]");
  }

  @Test
  public void testGetPalindromesOne() {
    PalindromeSequence palindrome = new PalindromeSequence("22");
    Assert.assertEquals(palindrome.getPalindromes().toString(), "[22]");
  }

  @Test
  public void testGetPalindromesDoublePoint() {
    PalindromeSequence palindrome = new PalindromeSequence("22.3");
    Assert.assertEquals(palindrome.getPalindromes().toString(), "[22]");
  }

  @Test
  public void testGetPalindromesDoubleComma() {
    PalindromeSequence palindrome = new PalindromeSequence("22,9");
    Assert.assertEquals(palindrome.getPalindromes().toString(), "[22]");
  }

 */

}
