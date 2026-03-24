// Question - Move all zeros to end

package Date17Mar2026;

public class Question_12 {
    static void Move_allzerotoend(int arr[]) {
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[zero];
                arr[zero] = temp;

                zero++;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 2, 0, 5, 0, 7 };
        Move_allzerotoend(arr);
        for(num)
        

    }
}
