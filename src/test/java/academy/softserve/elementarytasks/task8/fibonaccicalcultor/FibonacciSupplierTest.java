package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class FibonacciSupplierTest {

  FibonacciSupplier fibonacci = new FibonacciSupplier();

  @Test
  public void testCreatorFibonacciLength() {
    Assert.assertEquals(fibonacci.creatorFibonacci(new BigInteger("1")).toString(), "[0, 1, 2, 3, 5, 8]");
  }

  @Test
  public void testCreatorFibonacciLengthZero() {
    Assert.assertEquals(fibonacci.creatorFibonacci(new BigInteger("0")).toString(), "[]");
  }

  @Test
  public void testCreatorFibonacciLengthMinus() {
    Assert.assertEquals(fibonacci.creatorFibonacci(new BigInteger("-1")).toString(), "[]");
  }

  @Test
  public void testCreatorFibonacciRange() {
    Assert.assertEquals(fibonacci.creatorFibonacci(new BigInteger("0"), new BigInteger("10")).toString(), "[0, 1, 2, 3, 5, 8]");
  }

  @Test
  public void testCreatorFibonacciRangeZero() {
    Assert.assertEquals(fibonacci.creatorFibonacci(new BigInteger("0"), new BigInteger("0")).toString(), "[0]");
  }

  @Test
  public void testCreatorFibonacciRangeMinus() {
    Assert.assertEquals(fibonacci.creatorFibonacci(new BigInteger("-1"), new BigInteger("10")).toString(), "[0, 1, 2, 3, 5, 8]");
  }

  @Test
  public void testCreatorFibonacciRangeWrong() {
    Assert.assertEquals(fibonacci.creatorFibonacci(new BigInteger("100"), new BigInteger("1")).toString(), "[]");
  }
}
