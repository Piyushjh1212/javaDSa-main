package Date17Mar2026;

class Numbers {
    void num() {
        System.out.println("Numbers are:");
        
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Numbers num = new Numbers(); // object create
        num.num();                   // method call
    }
}

// print all elements Numbers 
