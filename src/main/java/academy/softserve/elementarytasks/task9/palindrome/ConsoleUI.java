package academy.softserve.elementarytasks.task9.palindrome;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Set;

public class ConsoleUI {

  private String line;
  private int tempLine = 0;

  public String consoleInput() {
    do {
      Scanner sc = new Scanner(System.in);
      showString("Enter the number to calculate the palindrome (only integers):");
      line = sc.nextLine();
      try {
        BigInteger tempLine = new BigDecimal(line).toBigInteger();
          return line;
      } catch (NumberFormatException ex) {
        showString("Incorrect input: You should enter only integers, please try again!\n");
      }
    } while (true);
  }

  private void showString(String text) {
    System.out.println(text);
  }

  public void showSet(Set<String> text) {
    if (text.size() < 1) {
      showString("[0]");
    } else {
      System.out.println(text);
    }
  }

    public String getLine () {
      return line;
    }
  }

