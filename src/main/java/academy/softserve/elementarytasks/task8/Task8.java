package academy.softserve.elementarytasks.task8;
import java.util.Scanner;

//Ряд Фибоначчи
//Вывести все числа Фибоначчи, которые удовлетворяют переданному в функцию ограничению:
//находятся в указанном диапазоне, либо имеют указанную длину.
public class Task8 {

  public static void main(String[] args) {
    int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
            10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309,
            3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141,
            267914296, 433494437, 701408733};


    setType();
    range(arr, setRange(), setRangeUpper());
    checkLeanth(arr, setLength());

  }


  private static int setRange() {
    int lower = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("set lower range:");
    String lowerStr = sc.nextLine();
    try {
      lower = Integer.parseInt(lowerStr);
    } catch (NumberFormatException ex) {
      System.out.println("Incorrect range!");
    }
    return lower;
  }
    private static int setRangeUpper() {
    int upper = 0;
    Scanner sc = new Scanner(System.in);
      System.out.println("set upper range:");
      String upperStr = sc.nextLine();
      try {
        upper = Integer.parseInt(upperStr);
      } catch (NumberFormatException ex) {
        System.out.println("Incorrect range!");
      }
      return upper;
  }

  private static int setLength() {
    int length = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("");
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
    return length;
  }

  private static void setType() {
    int setType;
    Scanner sc = new Scanner(System.in);
    System.out.println("This program will show masive of fibonach\n" +
            "please show the type \n(1) - range (2) - length");

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


  private static void range(int[] arr, int lower, int upper) {
    for(int element : arr)
      if (lower <= element & element <= upper) System.out.print(element + ", ");
  }
  private static void checkLeanth(int[] arr, int lenth) {
    if (lenth == 1) {
      int x = 0;
      int k = 7;
      test(arr, x, k);
    }

    if (lenth == 2) {
      int x = 7;
      int k = 12;
      test(arr, x, k);
    }
    if (lenth == 3) {
      int x = 12;
      int k = 17;
      test(arr, x, k);
    }
    if (lenth == 4) {
      int x = 17;
      int k = 21;
      test(arr, x, k);
    }
    if (lenth == 5) {
      int x = 21;
      int k = 26;
      test(arr, x, k);
    }
    if (lenth == 6) {
      int x = 26;
      int k = 31;
      test(arr, x, k);
    }
    if (lenth == 7) {
      int x = 31;
      int k = 36;
      test(arr, x, k);
    }
    if (lenth == 8) {
      int x = 36;
      int k = 40;
      test(arr, x, k);
    }
    if (lenth == 9) {
      int x = 40;
      int k = 45;
      test(arr, x, k);
    }
  }

  private static void test(int[] arr, int x, int k) {
    for (int i=0; x < k; x++)
      System.out.print(arr[x] + ", ");
  }
}


