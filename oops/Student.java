package OOPS;

public class Student {
    String name;
    int rollno;
    int marks;
    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    public Student(String name) {
        this.name = name;
    }
    public void dispInfo() {
        System.out.println("[Name : " + name + ", Rollno : " + rollno + ", Marks : " + marks + "]");
    }
    public static void main(String[] args) {
        Student stu = new Student(21, "Ram", 100);
        stu.dispInfo();
    }
}


