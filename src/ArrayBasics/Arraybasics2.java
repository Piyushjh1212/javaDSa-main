package ArrayBasics;

public class Arraybasics2 {
    public static int ArraySum(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int result = ArraySum(arr);
        System.out.println("The sum of the array elements is: " + result);
    }
}
