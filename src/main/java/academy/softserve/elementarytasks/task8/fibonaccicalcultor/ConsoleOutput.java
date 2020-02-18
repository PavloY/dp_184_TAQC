package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigInteger;

public class ConsoleOutput {



  private void showResult(String text) {
    System.out.println(text);
  }

  public void showFibonacci(BigInteger previousNumbers) {
    System.out.print(previousNumbers + ", ");
  }


}
