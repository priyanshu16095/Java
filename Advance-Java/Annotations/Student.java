package src.java.Annotations;

public class Student {
    @Details(age = 18, name = "Priyanshu Gupta", city = "Moradabad")
    public static class stuDetails {
    }
    public static void main(String[] args) {
        stuDetails d = new stuDetails();
        Class c = d.getClass();
        System.out.println(c.getName());
    }
}
