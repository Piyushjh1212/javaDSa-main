package Date17Mar2026;

public class Question_17 {
    static void findconsecutive_1s(int[] arr) {
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }
        maxcount = Math.max(maxcount, count);
        System.out.println(maxcount);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1 };
        findconsecutive_1s(arr);
        System.out.println();
    }
}