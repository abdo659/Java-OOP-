package Task;

class Car extends Vehicle {

    public Car(String brand, int year) {
        super(brand, year); // Calls the superclass (Vehicle) constructor
    }

    public void honk() {
        System.out.println("Honk honk!");
    }
}
