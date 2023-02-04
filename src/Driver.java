public class Driver {
    private String name;
    private int age;

    // Constructor
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void drive() {
        System.out.println("Ray is driving");
    }

    // get attributes
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}



