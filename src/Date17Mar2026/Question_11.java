package Date17Mar2026;

public class Question_11 {
  static void k_2rotate(int arr[]) {
    int k = 2;

    for (int i = 0; i < k; i++) {

      int last = arr[arr.length - 1];

      // right shift
      for (int j = arr.length - 1; j > 0; j--) {
        arr[j] = arr[j - 1];
      }

      arr[0] = last; // har rotation ke baad
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    k_2rotate(arr);

    for (int num : arr) {
      System.out.print(num + "");
    }
  }

}
