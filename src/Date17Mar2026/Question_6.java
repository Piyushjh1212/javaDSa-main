// Swap two Numbers Without using Temporary variable..
package Date17Mar2026;

public class Question_6 {
    int a, b;

    Question_6(int x, int y) {
        a = x;
        b = y;
    }

    void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    void Display() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String args[]) {
        Question_6 obj = new Question_6(5, 10);

        System.out.println("Before Swap:");
        obj.Display();

        obj.swap();

        System.out.println("After Swap:");
        obj.Display();

    }

}
