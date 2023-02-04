public class Car {
    private String model;
    private int price;

    // Constructor
    public Car(String model, int price ) {
        this.model = model;
        this.price = price;
    }

    // get attributes
    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }

    // functionalities
    public void start() {
        System.out.println("The car started");
    }

    public void stop() {
        System.out.println("The car stopped");

    }

    public void move() {
        System.out.println("The car is moving");

    }

    // toString = strukturer/returnerer objekter som string
    @Override
    public String toString() {
        return "Car {" +
                "model = '" + model + '\'' +
                ", price = " + price +
                '}';
    }
}