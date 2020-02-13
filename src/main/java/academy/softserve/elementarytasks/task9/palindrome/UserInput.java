package academy.softserve.elementarytasks.task9.palindrome;

import java.util.Scanner;

public class UserInput {
  public UserInput(int line) {
    this.line = line;
  }
  public UserInput() {
  }
  private int line;

  public int enterText (String text) {
    Scanner sc = new Scanner(System.in);
    System.out.println(text);
    line = Integer.parseInt(sc.nextLine());
    return line;
  }

  public int getLine() {
    return line;
  }
}
