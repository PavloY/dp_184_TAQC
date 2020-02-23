package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

import java.util.Scanner;

public class ConsoleInput {

  public String scanInput(String text) {
    Scanner sc = new Scanner(System.in);
    ConsoleOutPut print = new ConsoleOutPut();
    print.showResult(text);
    return sc.nextLine();
  }

}
