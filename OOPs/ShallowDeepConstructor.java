import java.util.*;
public class ShallowDeepConstructor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student("Piyush", 1, new int[]{10, 20, 30});
        System.out.print("Student name = "+s1.name+"\nStudent roll = "+s1.roll+"\nStudent marks = ");
        for(int i = 0; i < s1.marks.length; i++){
            System.out.print(s1.marks[i]+" ");
        }

        System.out.println("\nCopy Constructor");
        Student s2 = new Student(s1);
        System.out.print("Student name = "+s2.name+"\nStudent roll = "+s2.roll+"\nStudent marks = ");
        for(int i = 0; i < s2.marks.length; i++){
            System.out.print(s2.marks[i]+" ");
        }
    }
}
class Student {
    String name;
    int roll;
    int[] marks;

    Student(String name, int roll, int[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    //Shallow Constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //Deep copy
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}