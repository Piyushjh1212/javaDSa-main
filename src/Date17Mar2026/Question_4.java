package Date17Mar2026;

class Number_1{
  void evenSum(){
    int sum = 0;

    System.out.print("Even Numbers:");

    for(int i=1; i<=10; i++ ){
      if(i % 2 == 0) {
      System.out.print(i + " ");
      sum = sum + i;
      }
    }

    System.out.println("\nSum of even numbers: " + sum);
  }

}

public class Question_4 {
  public static void main(String[] args){
    Number_1 n = new Number_1();
    n.evenSum();
  }
    
}
