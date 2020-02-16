package academy.softserve.elementarytasks.task8;

import academy.softserve.elementarytasks.task8.fibonaccicalcultor.ConsoleUI;

/**Ряд Фибоначчи
 Вывести все числа Фибоначчи, которые удовлетворяют переданному в функцию ограничению:
 находятся в указанном диапазоне, либо имеют указанную длину.
 */

public class Main {

  public static void main(String[] args) {

    ConsoleUI console = new ConsoleUI();



    switch(console.scanInput("This program will show the Fibonacci series\n" +
            "select type (1) - range (2) - length:")) {
      case 1:  console.showFibonacci(
               console.scanInput("set lower range:")
              ,console.scanInput("set upper range:"));
        break;
      case 2:  console.showFibonacci(console.scanInput("set length:"));
        break;
    }
  }
}


