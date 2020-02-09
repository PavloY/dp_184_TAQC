package academy.softserve.elementarytasks.task8;
import java.util.Scanner;

//Ряд Фибоначчи
//Вывести все числа Фибоначчи, которые удовлетворяют переданному в функцию ограничению:
//находятся в указанном диапазоне, либо имеют указанную длину.
public class Task8 {

  public static void main(String[] args) {

    setType();
    setLength();
    setRange();
  }


  private static void setRange() {
    int lower;
    int upper;
    Scanner sc = new Scanner(System.in);

      System.out.println("set lower range:");
      String lowerStr = sc.nextLine();
      try {
        lower = Integer.parseInt(lowerStr);
      } catch (NumberFormatException ex) {
        System.out.println("Incorrect range!");
      }



      System.out.println("set upper range:");
      String upperStr = sc.nextLine();
      try {
        upper = Integer.parseInt(upperStr);
      } catch (NumberFormatException ex) {
        System.out.println("Incorrect range!");
      }

    System.out.println("have a range");

  }

  private static void setLength() {
    int length = -1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers length:");
    String setString = sc.nextLine();
    try {
      length = Integer.parseInt(setString);
    } catch (NumberFormatException ex) {
      System.out.println("Incorrect length!");
    }
    if (length > 9) {
      System.out.println("Incorrect length!");
    }
      System.out.println("have a length");

  }

  private static void setType() {
    int setType;
    Scanner sc = new Scanner(System.in);
    System.out.println("This program will show masive of fibonach\n" +
            "please show the type \n(1) - range\n(2) - length");

    String setString = sc.nextLine();
    try {
      setType = Integer.parseInt(setString);
      if (setType == 2 || setType == 1) {

      } else {
        System.out.println("Error set value, please enter 1 or 2");
      }
    } catch (NumberFormatException ex) {
      System.out.println("Error set value, please enter 1 or 2");
    }
  }

}


