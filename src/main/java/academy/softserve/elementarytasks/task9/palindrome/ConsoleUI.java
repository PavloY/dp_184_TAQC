package academy.softserve.elementarytasks.task9.palindrome;

import java.util.Scanner;
import java.util.Set;

public class ConsoleUI {

  private String line;

  public String enterText (String text) {
    Scanner sc = new Scanner(System.in);
    System.out.println(text);
    line = sc.nextLine();
    return line;
  }

  public void show (Set<String> text){
    System.out.println(text);
  }

  public String getLine() {
    return line;
  }
}
