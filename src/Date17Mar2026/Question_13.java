// Find the second largest element in an array
package Date17Mar2026;

public class Question_13 {
    static int Second_largestelement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int Second_max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                Second_max = max;
                max = num;
            } else if (num > Second_max && num != max) {
                Second_max = num;
            }
        }
        return Second_max;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 4, 7 };
       int  piyush = Second_largestelement(arr);
        System.out.print(piyush);
    }

}
