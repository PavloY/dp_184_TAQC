package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ConsoleUI {

  private String line;

  public int scanInput(String text) {
    do {
      Scanner sc = new Scanner(System.in);
      showResult(text);
      line = sc.nextLine();
      try {
        BigInteger tempLine = new BigDecimal(line).toBigInteger();
        return Integer.parseInt(line);
      } catch (NumberFormatException ex) {
        showResult("Incorrect input: You should enter only integers, please try again!\n");
      }
    } while (true);
  }

  private void showResult(String text) {
    System.out.println(text);
  }

  public void showFibonacci(BigInteger previousNumbers) {
    System.out.print(previousNumbers + ", ");
  }

}
