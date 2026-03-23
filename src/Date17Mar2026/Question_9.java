package Date17Mar2026;

public class Question_9 {
    static void findthemaxmin(int arr[]) {

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num > max) {
                second_max = max;
                max = num;
            } else if (num > second_max && num != max) {
                second_max = num;
            }

            if (num < min) {
                second_min = min;
                min = num;
            } else if (num < second_min && num != min) {
                second_min = num;
            }
        }
        System.out.println("Second Largest: " + second_max);
        System.out.println("Second Smallest: " + second_min);

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 54, 12, 63, 45 };
        findthemaxmin(arr);
    }

}
