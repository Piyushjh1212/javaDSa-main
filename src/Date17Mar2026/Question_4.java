// write a programme to print even count and sum of all even numbers and total numbers.

package Date17Mar2026;

class Number_1 {
  void evenSum() {
    int sum = 0;
    int total = 0;

    System.out.print("\nEven Numbers:");

    for (int i = 1; i <= 10; i++) {
      total = total + i;
      if (i % 2 == 0) {
        System.out.print(i + " ");
        sum = sum + i;
      }
    }
    System.out.println("\nSum of even numbers: " + sum);
    System.out.println("\nSum of total even numbers: " + total);
  }

}

public class Question_4 {
  public static void main(String[] args) {
    Number_1 n = new Number_1();
    n.evenSum();
  }

}
