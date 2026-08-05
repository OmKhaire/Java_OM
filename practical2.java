package demo;
import java.util.*;

public class practical2 {

    static class Person {
        String name;
        int age;

        void see() {
            System.out.println("Name is: " + name);
            System.out.println("Age is: " + age);
        }
    }

    static class Child extends Person {
        int employeeId;

        void id() {
            System.out.println("Employee id is: " + employeeId);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Child p = new Child();

        System.out.print("Enter the name: ");
        p.name = sc.nextLine();

        System.out.print("Enter the age: ");
        p.age = sc.nextInt();

        System.out.print("Enter the Employee id: ");
        p.employeeId = sc.nextInt();

        System.out.println();
        p.see();
        p.id();

        sc.close();
    }
}
