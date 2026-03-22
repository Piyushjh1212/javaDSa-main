package Date17Mar2026;

public class Question_7 {
  int a, b;

  Question_7(int x, int y) {
    a = x;
    b = y;
  }

  void swap() {
    int temp = a;
    a = b;
    b = temp;
  }

  void Display() {
    System.out.println("a = " + a + ", b = " + b);
  }

  public static void main(String[] args) {
    Question_7 obj = new Question_7(10, 15);
    System.out.println("Before Swap:");
    obj.Display();

    obj.swap();

    System.out.println("After Swap:");
    obj.Display();
  }

}
