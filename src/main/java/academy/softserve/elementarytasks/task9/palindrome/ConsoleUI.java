package academy.softserve.elementarytasks.task9.palindrome;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Set;

public class ConsoleUI {

  private String line;

  public String scanInput() {
    do {
      Scanner sc = new Scanner(System.in);
      showResult("Enter the number to calculate the palindrome (only integers):");
      line = sc.nextLine();
      try {
        BigInteger tempLine = new BigDecimal(line).toBigInteger();
          return line;
      } catch (NumberFormatException ex) {
        showResult("Incorrect input: You should enter only integers, please try again!\n");
      }
    } while (true);
  }

  private void showResult(String text) {
    System.out.println(text);
  }

  public void showResult(Set<String> set) {
    if (set.size() < 1) {
      showResult("[0]");
    } else {
      System.out.println(set);
    }
  }

    public String getLine () {
      return line;
    }
  }

