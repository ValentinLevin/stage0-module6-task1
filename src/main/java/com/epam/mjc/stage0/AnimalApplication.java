package com.epam.mjc.stage0;

public class AnimalApplication {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println("Bird: " + bird.getDescription());
        System.out.println("Dog: " + dog.getDescription());
    }
}
