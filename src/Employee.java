public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

        // If the monthly salary is not positive, set it to 0.0.
        if (salary < 0) {
            setSalary(0.0);
        }
    }

    // Get attributes
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    // Create two Employee objects and display each object’s yearly salary.
    public double getYearlySalary() {
        return this.salary * 12;

    }

    // If the monthly salary is not positive, set it to 0.0.
     public void setSalary (double salary) {
        this.salary = salary;
     }

     // toString = strukturer/returnerer objekter som string
    @Override
    public String toString() {
        return "Employee{" +
                "First Name ='" + firstName + '\'' +
                ", last name =" + lastName +
                ", salary=" + salary +
                '}';

    }


    }
