package lec10_abstraction.abstractclass.Animal_Abstract;
public class Processor {
    public static void main(String[] args) {
        Dog dog = new Dog("Lulu");
        dog.displayName();
        dog.makeSound();
    }
}
