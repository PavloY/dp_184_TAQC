package academy.softserve.elementarytasks.task9.palindrome;

import java.util.Scanner;
import java.util.Set;

public class ConsoleUI {

  private String line;
  private int lineInt = 0;

  public String enterText (String text) {
    Scanner sc = new Scanner(System.in);
    System.out.println(text);
    line = sc.nextLine();
    return line;
  }

  public String consoleInput() {
    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter int:");
      line = sc.nextLine();
      try {
        lineInt = Integer.parseInt(line);
        if (lineInt > 10 ) {
          return line;
        } else {
          System.out.println("[0]");
        }
      } catch (NumberFormatException ex) {
        System.out.println("Incorrect input!");
      }
    } while (true);
  }


  public void show (Set<String> text){
    System.out.println(text);
  }

  public String getLine() {
    return line;
  }
}
