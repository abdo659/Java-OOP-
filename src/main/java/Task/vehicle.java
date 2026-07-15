package Task;

class Vehicle {
    String brand;
    int year;

    // Constructor to initialize the fields
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("Vehicle started");
    }
}
