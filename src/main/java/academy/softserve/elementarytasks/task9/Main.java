package academy.softserve.elementarytasks.task9;

import academy.softserve.elementarytasks.task9.palindrome.PalindromeValidator;
import academy.softserve.elementarytasks.task9.palindrome.UserInput;

//Проверить является ли число или его часть палиндромом. Например, число 1234437
//не является палиндромом, но является палиндромом его часть 3443. Числа меньшие, чем
//10 палиндромом не считать.
//Входные параметры: число
//Выход: извлечённый из числа палиндром либо 0, если извлечение не удалось.

public class Main {
  public static void main(String[] args) {

    UserInput input = new UserInput();
    PalindromeValidator palindromeValidator = new PalindromeValidator();

    input.enterText("enter int:");
    System.out.println(palindromeValidator.findPalindromes(input.getLine()));

  }
}