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


    switch(Integer.parseInt(input.scanInput("This program will show the Fibonacci series\n" +
            "select type (1) - range (2) - length:"))) {
      case 1:  output.showFibonacci(
               input.printRange(input.scanInput("set lower range:"))
              ,input.printRange(input.scanInput("set upper range:")));
        break;
      case 2:  output.showFibonacci(input.scanInput("set length:"));
        break;
    }
  }
}


