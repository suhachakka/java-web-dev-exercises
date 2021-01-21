package org.launchcode.java.demos.exercises;

public class Greeting {

    String name = "Jess";

    public void sayHello() {
        System.out.println("Hello " + name + "!");

    }

    public static void main(String[] args) {
        Greeting greet = new Greeting();
        greet.sayHello();
    }
}