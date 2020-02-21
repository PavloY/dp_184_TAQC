package academy.softserve.elementarytasks.task9.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeSequenceTests {

  PalindromeSequence palindrome = new PalindromeSequence();

  @Test
  public void testIsPalindromeInteger() {
    Assert.assertTrue(palindrome.isPalindrome("123321"));
  }

  @Test
  public void testIsPalindromeZero() {
    Assert.assertTrue(palindrome.isPalindrome("0"));
  }

  @Test
  public void testIsPalindromeString() {
    Assert.assertTrue(palindrome.isPalindrome("civic"));
  }

  @Test
  public void testIsPalindromeIntegerBad() {
    Assert.assertFalse(palindrome.isPalindrome("12332"));
  }

  @Test
  public void testIsPalindromeSpace() {
    Assert.assertTrue(palindrome.isPalindrome(" "));
  }

  @Test
  public void testIsPalindromeMinusBad() {
    Assert.assertFalse(palindrome.isPalindrome("-11"));
  }

  @Test
  public void testFindPalindromesOne() {
    Assert.assertEquals(palindrome.findPalindromes("11").toString(), "[11]");
  }

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
    PalindromeSequence palindrome = new PalindromeSequence("22,3");
    Assert.assertEquals(palindrome.getPalindromes().toString(), "[22]");
  }

}
