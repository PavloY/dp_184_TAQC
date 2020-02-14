package academy.softserve.elementarytasks.task9.palindrome;

import java.util.Scanner;

public class UserInput {
  public UserInput(String line) {
    this.line = line;
  }
  public UserInput() {
  }
  private String line;

  public String enterText (String text) {
    Scanner sc = new Scanner(System.in);
    System.out.println(text);
    line = sc.nextLine();
    return line;
  }

  public String getLine() {
    return line;
  }
}
