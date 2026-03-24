// rotate array one Position to the right
package Date17Mar2026;

public class Question_10 {
    static void rotate_array(int arr[]) {
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        rotate_array(arr);

        for (int num : arr) {
            System.out.print(num + "");
        }

    }

}
