package academy.softserve.elementarytasks.task9;

import academy.softserve.elementarytasks.task9.palindrome.PalindromeCreator;
import academy.softserve.elementarytasks.task9.palindrome.ConsoleInput;

/**Проверить является ли число или его часть палиндромом. Например, число 1234437
не является палиндромом, но является палиндромом его часть 3443. Числа меньшие, чем
10 палиндромом не считать.
Входные параметры: число
Выход: извлечённый из числа палиндром либо 0, если извлечение не удалось.
*/

public class Main {
  public static void main(String[] args) {

    ConsoleInput console = new ConsoleInput();
    PalindromeCreator palindrome = new PalindromeCreator();

    console.scanInput();
    console.showResult(palindrome.findPalindromes(console.getLine()));
  }
}
