package lec08_objects_classes.object_class;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}
