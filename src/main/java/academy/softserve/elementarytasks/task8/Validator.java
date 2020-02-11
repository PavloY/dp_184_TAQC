package academy.softserve.elementarytasks.task8;

import java.util.Scanner;

public class Validator {


  protected static int setLowerRange() {
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

  protected static int setUpperRange() {
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

  protected static int setLength() {
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

  protected static void setType() {
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

  protected static void showRange(int[] arr, int lower, int upper) {
    for(int element : arr)
      if (lower <= element & element <= upper) System.out.print(element + ", ");
  }

  protected static void checkLength(int[] arr, int lenth) {
    if (lenth == 1) {
      int x = 0;
      int k = 7;
      showLength(arr, x, k);
    }

    if (lenth == 2) {
      int x = 7;
      int k = 12;
      showLength(arr, x, k);
    }
    if (lenth == 3) {
      int x = 12;
      int k = 17;
      showLength(arr, x, k);
    }
    if (lenth == 4) {
      int x = 17;
      int k = 21;
      showLength(arr, x, k);
    }
    if (lenth == 5) {
      int x = 21;
      int k = 26;
      showLength(arr, x, k);
    }
    if (lenth == 6) {
      int x = 26;
      int k = 31;
      showLength(arr, x, k);
    }
    if (lenth == 7) {
      int x = 31;
      int k = 36;
      showLength(arr, x, k);
    }
    if (lenth == 8) {
      int x = 36;
      int k = 40;
      showLength(arr, x, k);
    }
    if (lenth == 9) {
      int x = 40;
      int k = 45;
      showLength(arr, x, k);
    }
  }

  private static void showLength(int[] arr, int x, int k) {
    for (int i=0; x < k; x++)
      System.out.print(arr[x] + ", ");
  }
}
