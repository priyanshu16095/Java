package OOPS.Abstract_Classes;

public class Dog extends Animal{
    public void makeSound() {
        System.out.println("Bhao bhao ...");
    }
    public void sleep() {
        System.out.println("Zzz...");
    }
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}
