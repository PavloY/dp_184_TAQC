package academy.softserve.elementarytasks.task8.fibonaccicalcultor;

public class UserOutput {

  public void showRange(int[] arr, int lower, int upper) {
    for (int element : arr)
      if (lower <= element & element <= upper)
        System.out.print(element + ", ");
        System.out.print("\n");
  }

  public void showLength(int[] arr, int[] list) {
    for (int i = 0; list[0] < list[1]; list[0]++)
      System.out.print(arr[list[0]] + ", ");
  }

}
