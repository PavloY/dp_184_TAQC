package academy.softserve.elementarytasks.task9.palindrome;

import java.util.Scanner;

public class ConsoleInput {
  private static final String ENTER_NUMBER = "Enter the number to calculate the palindrome (only integers):";

  ConsoleOutPut print = new ConsoleOutPut();

  public String scanInput(String text) {
    Scanner sc = new Scanner(System.in);
    print.showResult(text);
    return sc.nextLine();
  }

  public String getInput() {
    return scanInput(ENTER_NUMBER);
  }



}


