package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigInteger;
import java.util.ArrayList;

@RunWith(DataProviderRunner.class)
public class FibonacciSupplierTest {

  FibonacciSupplier fibonacci;

  @DataProvider
  public static Object[][] creatorFibonacciLength(){
    return new Object[][] {
            {"1", "0, 1, 1, 2, 3, 5, 8"},
            {"2", "13, 21, 34, 55, 89"},
            {"3", "144, 233, 377, 610, 987"},
            {"4", "1597, 2584, 4181, 6765"},
            {"5", "10946, 17711, 28657, 46368, 75025"},
            {"6", "121393, 196418, 317811, 514229, 832040"},
            {"7", "1346269, 2178309, 3524578, 5702887, 9227465"},
            {"8", "14930352, 24157817, 39088169, 63245986"},
            {"9", "102334155, 165580141, 267914296, 433494437, 701408733"},
            {"10", "1134903170, 1836311903, 2971215073, 4807526976, 7778742049"},
            {"11", "12586269025, 20365011074, 32951280099, 53316291173, 86267571272"},
            {"12", "139583862445, 225851433717, 365435296162, 591286729879, 956722026041"},
            {"13", "1548008755920, 2504730781961, 4052739537881, 6557470319842"},
            {"14", "10610209857723, 17167680177565, 27777890035288, 44945570212853, 72723460248141"},
            {"15", "117669030460994, 190392490709135, 308061521170129, 498454011879264, 806515533049393"},
            {"16", "1304969544928657, 2111485077978050, 3416454622906707, 5527939700884757, 8944394323791464"},
            {"17", "14472334024676221, 23416728348467685, 37889062373143906, 61305790721611591, 99194853094755497"},
            {"18", "160500643816367088, 259695496911122585, 420196140727489673, 679891637638612258"},
            {"19", "1100087778366101931, 1779979416004714189, 2880067194370816120, 4660046610375530309, 7540113804746346429"},
            {"20", "12200160415121876738, 19740274219868223167, 31940434634990099905, 51680708854858323072, 83621143489848422977"}
    };
  }

  @DataProvider
  public static Object[][] creatorFibonacciRange(){
    return new Object[][] {
            {"0","10","0, 1, 1, 2, 3, 5, 8"},
            {"10","100","13, 21, 34, 55, 89"},
            {"100","1000","144, 233, 377, 610, 987"},
            {"1000","10000","1597, 2584, 4181, 6765"},
            {"10000","100000","10946, 17711, 28657, 46368, 75025"},
            {"100000","1000000","121393, 196418, 317811, 514229, 832040"},
            {"1000000","10000000","1346269, 2178309, 3524578, 5702887, 9227465"},
            {"100000000","1000000000","102334155, 165580141, 267914296, 433494437, 701408733"}
    };
  }

  @Before
  public void init () {
    fibonacci = new FibonacciSupplier();
  }


  @Test
  @UseDataProvider("creatorFibonacciLength")
  public void testCreatorFibonacciLength(String input, String expect) {

    ArrayList<String> expected = new ArrayList<>();
    expected.add(expect);
    BigInteger length = new BigInteger(input);

    ArrayList<String> actual = fibonacci.creatorFibonacci(length);

    Assert.assertEquals(expected.toString(), actual.toString());
  }


  @Test
  @UseDataProvider("creatorFibonacciRange")
  public void testCreatorFibonacciRange(String inputLower, String inputUpper, String expect) {

    ArrayList<String> expected = new ArrayList<>();
    expected.add(expect);
    BigInteger lower = new BigInteger(inputLower);
    BigInteger upper = new BigInteger(inputUpper);

    ArrayList<String> actual = fibonacci.creatorFibonacci(lower, upper);

    Assert.assertEquals(expected.toString(), actual.toString());
  }

  @After
  public void tearDown(){
    fibonacci = null;
  }

}
