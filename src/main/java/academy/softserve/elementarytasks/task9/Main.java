package academy.softserve.elementarytasks.task9;


import academy.softserve.elementarytasks.task9.palindrome.ConsoleInput;
import academy.softserve.elementarytasks.task9.palindrome.ConsoleOutPut;
import academy.softserve.elementarytasks.task9.palindrome.PalindromeSequence;
import academy.softserve.elementarytasks.task9.palindrome.Validator;

/**Проверить является ли число или его часть палиндромом. Например, число 1234437
 не является палиндромом, но является палиндромом его часть 3443. Числа меньшие, чем
 10 палиндромом не считать.
 Входные параметры: число
 Выход: извлечённый из числа палиндром либо 0, если извлечение не удалось.
 */

public class Main {
  public static void main(String[] args) {

    ConsoleInput input = new ConsoleInput();
    Validator validator = new Validator(input.getInput());
    PalindromeSequence palindrome = new PalindromeSequence(validator.getInputValidate());
    Validator validatorSet = new Validator(palindrome.getPalindromes());
    ConsoleOutPut print = new ConsoleOutPut(validatorSet.getValidateSet());
    print.showResult();
  }
}
