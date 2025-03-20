class Car {
    // Attributes
    private String brand;
    private String model;
    private int year;
    private int speed;

    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.speed = 0;
    }

    // Parameterized constructor
    public Car(String brand, String model, int year, int speed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println();
    }

    // Method to accelerate the car
    public void accelerate(int incrementSpeed) {
        speed += incrementSpeed;
        System.out.println("The speed of the car has been increased by " + incrementSpeed + " km/h.");
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Instantiate couple of cars using parameterized constructor
        Car car1 = new Car("Toyota", "Camry", 2020, 50);
        Car car2 = new Car("Honda", "Civic", 2019, 60);

        // Display information before speed increment
        System.out.println("Before Speed Increment:");
        car1.displayInfo();
        car2.displayInfo();

        // Accelerate the cars
        car1.accelerate(20); // Increase speed by 20 km/h
        car2.accelerate(15); // Increase speed by 15 km/h

        // Display information after speed increment
        System.out.println("After Speed Increment:");
        car1.displayInfo();
        car2.displayInfo();
    }
}
