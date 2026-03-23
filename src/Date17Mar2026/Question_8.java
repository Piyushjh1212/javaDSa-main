// Reverse an Array In-place Using Multiple Assignment

// 👉 Tumhe ek array diya hai:

// arr = [1, 2, 3, 4, 5]

// 👉 Task:

// Array ko reverse karo
// New array create nahi karna
// In-place reverse karna hai
// Preferably multiple assignment / swapping use karo

package Date17Mar2026;

import java.util.Arrays;

public class Question_8 {

   static void reverse(int arr[]) {
      int start = 0;
      int end = arr.length - 1;

      while (start < end) {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;

         start++;
         end--;
      }
   }

   public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 4, 5 };

      System.out.println("Before: " + Arrays.toString(arr));

      reverse(arr);

      System.out.println("After: " + Arrays.toString(arr));
   }

}
