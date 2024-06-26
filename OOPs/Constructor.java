import java.util.*;
public class Constructor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Parameterized Costructor
        Student s1 = new Student();

        //Non Parameterized Constructor
        Student s2 = new Student("Piyush", 1);
        System.out.println("String name = " +s2.name+ "\nInt roll = " + s2.roll);
        //Copy Construtor
        Student s3 = new Student(s2);
        System.out.println("String name = " +s3.name+ "\nInt roll = " + s3.roll);
    }
}

class Student {
    String name;
    int roll;
    
    Student() {
        System.out.println("Non parameterized Constructor is called");
    }

    Student(String name, int roll) {
        System.out.println("Parameterized Constructor is Called");
        this.name = name;
        this.roll = roll;
    }

    Student(Student s2) {
        System.out.println("Copy Constructor is called");
        this.name = s2.name;
        this.roll = s2.roll;
        
    }
}