package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

        // Cat cat = new Dog();

        Animal animal = (Animal) new Dog(); // implicit casting

        System.out.println("-----------------------------------------------------");

        Animal animal1 = new Dog(); //upcasting ==> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");


    }

}
