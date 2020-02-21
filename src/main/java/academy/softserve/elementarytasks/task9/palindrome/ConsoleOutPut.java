package academy.softserve.elementarytasks.task9.palindrome;

import java.util.Set;

public class ConsoleOutPut {

  public ConsoleOutPut() {
  }
  public ConsoleOutPut(Set<String> printSet) {
    this.printSet = printSet;
  }

  private Set<String> printSet;

  public void showResult(String text) {
    System.out.println(text);
  }

  public void showResult() {
    System.out.println(printSet);
  }



}