package academy.softserve.elementarytasks.task9.palindrome;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class PalindromeSequenceTests {

  PalindromeSequence palindrome = new PalindromeSequence();

  @Test
  public void testPalindromeSequence() {
    Assert.assertTrue(palindrome.isPalindrome("123321"));
  }


  @Test
  public void testPalindromeSequenceZero() {
    Assert.assertTrue(palindrome.isPalindrome("0"));
  }

  @Test
  public void testPalindromeSequenceString() {
    Assert.assertTrue(palindrome.isPalindrome("civic"));
  }

  @Test
  public void testPalindromeSequenceBad() {
    Assert.assertFalse(palindrome.isPalindrome("12332"));
  }

  @Test
  public void testPalindromeSequenceSpace() {
    Assert.assertTrue(palindrome.isPalindrome(" "));
  }

  @Test
  public void testPalindromeSequenceMinusBad() {
    Assert.assertFalse(palindrome.isPalindrome("-11"));
  }



}
