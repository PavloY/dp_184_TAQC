package academy.softserve.elementarytasks.task8;

//Ряд Фибоначчи
//Вывести все числа Фибоначчи, которые удовлетворяют переданному в функцию ограничению:
//находятся в указанном диапазоне, либо имеют указанную длину.
public class Luncher extends Validator {


  public static void main(String[] args) {

    FibonacciData fibonacciData = new FibonacciData();


    Validator.setType();
    Validator.showRange(fibonacciData.getArr(), Validator.setLowerRange(), Validator.setUpperRange());
    Validator.checkLength(fibonacciData.getArr(), Validator.setLength());

  }
}


