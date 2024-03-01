package src.java.Annotations;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        greet("Priyanshu");
        greetings("Priyanshu");

        Student stu = new Student("Priyanshu", 21);
        if (stu.getClass().isAnnotationPresent(veryImportant.class)) {
            System.out.println("That thing is very important!");
        } else {
            System.out.println("That thing is not very important :(");
        }

    }
    @myAnnotation
    public static void greet(String name) {
        System.out.println("Hello" + name + "!");
    }
    @RunImmidiately(times = 3)
    public static void greetings(String name) {
        System.out.println("Good Morning, " + name + "!");
    }
    @veryImportant
    public static class Student {
        private String Name;
        private int rollno;
        public Student(String Name, int rollno) {
            this.Name = Name;
            this.rollno = rollno;
        }
    }
}
