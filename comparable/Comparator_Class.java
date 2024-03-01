package comparable;

import java.util.*;

class Student {
    int rollno;
    String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [rollno: " + this.rollno + ", name: " + this.name + "]";
    }
}
public class Comparator_Class {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.rollno > s2.rollno) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        List<Student> students = new ArrayList<>();
        students.add(new Student(11, "Dogesh"));
        students.add(new Student(21, "Priyanshu Gupta"));
        students.add(new Student(20, "Dogelina"));
        students.add(new Student(5, "Cheems"));

        for(Student stu : students) {
            System.out.println(stu.toString());
        }
        System.out.println();

        Collections.sort(students, com);
        for(Student stu : students) {
            System.out.println(stu.toString());
        }
    }
}
