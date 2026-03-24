// Check if array is sorted or not
package Date17Mar2026;

public class Question_15 {
    static void Aray_is_sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.print("Array is not sorted");
                return;
            }
        }

        System.out.print("This is sorted");

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 7, 9, 6, 3, 5 };
        Aray_is_sorted(arr);
    }
}
