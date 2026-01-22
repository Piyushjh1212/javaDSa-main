class Student {
    int age;

    void study() {
        System.out.println("Student is studying");
        System.out.println("Age of student: " + age);
    }
}

public class ClassandObject {
    public static void main(String[] args) {
        Student s1 = new Student(); // object

        s1.age = 20;       // variable use
        s1.study();       // method call
    }
}


// Now we are doing an exapmle for the better understanding of the class and object concept.

// Question: 


// Create a Student class with 3 variables:  name (String),age (int),grade (char)

// And 1 method:  display() → this method should print the student details.

// Then in the Main class, create 2 objects:

// Student 1: name = "Piyush", age = 20, grade = 'A'

// Student 2: name = "Rahul", age = 19, grade = 'B'

// Call the display() method for both objects.

class studentDetails {
    String name;
    int age;
    char grade;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);  
        System.out.println("Grade: " + grade);
    }
}

class ClassandObject1{
    public static void main(String[] args){
        studentDetails s1 = new studentDetails();

        s1.name = "Piyush Jhariya";
        s1.age = 23;
        s1.grade = 'A';
        s1.display();
    }

}