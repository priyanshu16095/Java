package OOPS;

// super is used to access superclass contructor, superclass method, superclass field.
// super must be the first statement in the constructor
// super cannot be used in a static context

public class Super {
    public static void main(String[] args) {
        // Vehicle hondaCity = new Car();
        // hondaCity.speed();
    }
    public static class Vehicle {
        int maxSpeed = 180;
    }
    public static class Car extends Vehicle {
        int maxSpeed = 120;
        public void speed() {
            System.out.println("Maximum speed of vehicle : " + super.maxSpeed);
            System.out.println("Maximum speed of car : " + maxSpeed);   
        }
    }
    
}
