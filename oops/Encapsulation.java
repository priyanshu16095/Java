package OOPS;

// Achieved by declaring the instance variables private
// To acces outside the class getts and setters are used

public class Encapsulation {
    static class Person {
        private String name;
        private int age;
        public void getName() {
            System.out.println(name);
        }
        public void getAge() {
            System.out.println(age);
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void displayInfo() {
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
        }
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ram");
        person.setAge(21);
        person.displayInfo();
    }
    
}
