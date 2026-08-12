package demo;

public class inheritance {
    public static void main(String args[]) {

        Puppy p1 = new Puppy();

        p1.setName("Honey");
        p1.setAge(5);
        p1.setColor("Brown");

        System.out.println("Name of animal is: " + p1.name);
        System.out.println("Age of animal is: " + p1.age);
        System.out.println("Color of puppy is: " + p1.color);

        p1.eat();
        p1.bark();
        p1.play();
    }
}

class Animal {
    String name;
    int age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    String color;

    void setColor(String color) {
        this.color = color;
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {

    void play() {
        System.out.println("Puppy plays");
    }
}