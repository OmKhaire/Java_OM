public class Animal {

    public static void main(String[] args) {

        AnimalImpl a = new AnimalImpl("Dog", 5);

        a.eat();
        a.swim();
        a.showDetails();
    }
}

interface AnimalBehavior {
    void eat();
}

interface Swimmable {
    void swim();
}

class AnimalImpl implements AnimalBehavior, Swimmable {

    private String name;
    private int age;

    AnimalImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " eats food");
    }

    public void swim() {
        System.out.println(name + " can swim");
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}