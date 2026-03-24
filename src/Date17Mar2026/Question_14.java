// Remove Duplicate form an array  

package Date17Mar2026;

public class Question_14 {

    static int RemoveDuplicates(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1; // new length
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 9, 9 };

        int newLength = RemoveDuplicates(arr);

        // print unique elements
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}