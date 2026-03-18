// Object class use here

// Given an array of 5 integers, your task is to:

// Take input values from the user,

// Sort the numbers in ascending order, and

// Return the maximum (largest) number from the sorted array.

// 📌 Constraints

// The input array will always contain exactly 5 integers.

// -10^4 ≤ nums[i] ≤ 10^4

// 🧪 Example 1

// Input:
// [12, 7, 34, 9, 2]

// Sorted:
// [2, 7, 9, 12, 34]

// Output:
// 34

// 🧪 Example 2

// Input:
// [5, 5, 5, 5, 5]

// Output:
// 5

// 🧪 Example 3

// Input:
// [-10, 0, -5, 8, 20]

// Sorted:
// [-10, -5, 0, 8, 20]

// Output:
// 20

package JavaDsa;
import java.util.*;

class solution {
    public int findmax(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        solution sol = new solution();
        int maxNum = sol.findmax(nums);
        System.out.println("The maximum number is: " + maxNum);
        sc.close();
    }
}
