package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

public class FibonacciSupplier {

  public int[] FIBO = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
          10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309,
          3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141,
          267914296, 433494437, 701408733};

  public int[] checkLength(String lenth) {
    int[] list = new int[2];
    if (Integer.parseInt(String.valueOf(lenth)) == 1) {
      int x = 0;
      int k = 10;
      list[0] = x;
      list[1] = k;
    }
    if (Integer.parseInt(String.valueOf(lenth)) == 2) {
      int x = 7;
      int k = 12;
      list[0] = x;
      list[1] = k;

    }
    if (Integer.parseInt(String.valueOf(lenth)) == 3) {
      int x = 12;
      int k = 17;
      list[0] = x;
      list[1] = k;

    }
    if (Integer.parseInt(String.valueOf(lenth)) == 4) {
      int x = 17;
      int k = 21;
      list[0] = x;
      list[1] = k;

    }
    if (Integer.parseInt(String.valueOf(lenth)) == 5) {
      int x = 21;
      int k = 26;
      list[0] = x;
      list[1] = k;

    }
    if (Integer.parseInt(String.valueOf(lenth)) == 6) {
      int x = 26;
      int k = 31;
      list[0] = x;
      list[1] = k;

    }
    if (Integer.parseInt(String.valueOf(lenth)) == 7) {
      int x = 31;
      int k = 36;
      list[0] = x;
      list[1] = k;

    }
    if (Integer.parseInt(String.valueOf(lenth)) == 8) {
      int x = 36;
      int k = 40;
      list[0] = x;
      list[1] = k;

    }
    if (Integer.parseInt(String.valueOf(lenth)) == 9) {
      int x = 40;
      int k = 45;
      list[0] = x;
      list[1] = k;

    }
    return list;

  }


}
