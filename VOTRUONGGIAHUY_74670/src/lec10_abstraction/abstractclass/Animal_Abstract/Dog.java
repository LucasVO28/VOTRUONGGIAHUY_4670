package lec10_abstraction.abstractclass.Animal_Abstract;
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Barks barks");
    }
}
