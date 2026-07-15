package Task;

public class main {// 4. Main class to instantiate and demonstrate

        public static void main(String[] args) {
            // Instantiate a Car and a Bike
            Car myCar = new Car("Toyota", 2024);
            Bike myBike = new Bike("Trek", 2023);

            System.out.println("--- Testing Car ---");
            System.out.println("Brand: " + myCar.brand + ", Year: " + myCar.year);
            myCar.start(); // Inherited method from Vehicle
            myCar.honk();  // Own method from Car

            System.out.println("\n--- Testing Bike ---");
            System.out.println("Brand: " + myBike.brand + ", Year: " + myBike.year);
            myBike.start();    // Inherited method from Vehicle
            myBike.ringBell(); // Own method from Bike
        }
    {
    }
}
