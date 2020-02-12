package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.util.Scanner;

public class UserInput {

  public String printString(String text) {
    Scanner sc = new Scanner(System.in);
    System.out.println(text);
    return sc.nextLine();
  }

  public int printRange(String range) {
    return Integer.parseInt(String.valueOf(range));
  }

}
