package academy.softserve.elementarytasks.task8;

import academy.softserve.elementarytasks.task8.fibonaccicalcultor.UserInput;
import academy.softserve.elementarytasks.task8.fibonaccicalcultor.UserOutput;

//Ряд Фибоначчи
//Вывести все числа Фибоначчи, которые удовлетворяют переданному в функцию ограничению:
//находятся в указанном диапазоне, либо имеют указанную длину.
public class Main {

  public static void main(String[] args) {

    UserInput input = new UserInput();
    UserOutput output = new UserOutput();


    switch(Integer.parseInt(input.printString("This program will show the Fibonacci series\n" +
            "select type (1) - range (2) - length:"))) {
      case 1:  output.showFibonacci(
               input.printRange(input.printString("set lower range:"))
              ,input.printRange(input.printString("set upper range:")));
        break;
      case 2:  output.showFibonacci(input.printString("set length:"));
        break;
    }
  }
}


