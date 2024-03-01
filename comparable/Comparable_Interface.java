package comparable;

import java.util.*;

class Person implements Comparable<Person> {
    int age;
    String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [rollno: " + this.age + ", name: " + this.name + "]";
    }
    @Override
    public int compareTo(Person s) {
        if(this.age > s.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
public class Comparable_Interface {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(25, "Dogesh"));
        persons.add(new Person(18, "Priyanshu Gupta"));
        persons.add(new Person(24, "Dogelina"));
        persons.add(new Person(25, "Cheems"));
        persons.add(new Person(28, "Vimdhayak"));

        for(Person person : persons) {
            System.out.println(person.toString());
        }
        System.out.println();

        // WITHOUT PASSING AN OBJECT OF COMPARATOR CLASS
        // ALSO WITH INTEGER CLASS WE DID NOT PASS THE OBJECT, BECAUSE IT INSIDE ITS IMPLEMENTATION IMPLEMENTS COMPARABLE INTERFACE
        Collections.sort(persons);
        for(Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
