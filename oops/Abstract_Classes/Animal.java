package OOPS.Abstract_Classes;

abstract class Animal {
    public abstract void makeSound();    // ABSTRACT METHOD
    public void sleep() {                // REGULAR METHOD
        System.out.println("Zzz...");
    }

}