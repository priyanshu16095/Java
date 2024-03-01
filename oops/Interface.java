package OOPS;

// A mechanism to achieve abstraction and multiple inheritance. There can be only abstract methods.

public class Interface {
    public interface Engine {
        public void sound();
    }
    public interface MusicPlayer {
        public void next();
        public void previous();
    }

    public class Car implements Engine, MusicPlayer {
        public void sound() {
            System.out.println("MMmmm...");
        }
        public void next() {
            System.out.println("Hip hop");
        }
        public void previous() {
            System.out.println("Jazz");
        }
    }
    
}
