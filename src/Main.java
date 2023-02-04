import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Scanner;
import static sun.management.MemoryUsageCompositeData.getMax;

public class Main {
    public static void main(String[] args) {
          
        // Methods 1  - Define a method to find out if a person is eligible to vote
        Scanner vote = new Scanner(System.in);  // Scanner
        System.out.println("Please enter your age");
        int age = vote.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are NOT eligible to vote");
        }

        // Methods 2 - Prints maximum
        System.out.println(maxNum(1, 48, 10));
        // Methods 2 - Prints minimum
        System.out.println(minNum(110, -5, -30));


        // Methods 3 - Define a program to find out whether a given number is even or odd 
        Scanner evenOrOdd = new Scanner(System.in); // Scanner
                                                             
                System.out.print("Enter a number: ");        
                int num = evenOrOdd.nextInt();
                                                             
                if(num % 2 == 0)  // % = resten (modulus operator) --> dvs at resten af at dividere med 2 skal være 0
                    System.out.println(num + " is even");    
                else                                         
                    System.out.println(num + " is odd");


        // Methods 4 - Write a program that takes your full name as input and displays the abbreviations of the first + middle names except the last name which is displayed as it is.
        Scanner nameInput = new Scanner(System.in); // Scanner
        System.out.println("Please enter your full name");
        String fullName = nameInput.nextLine();            // input af fulde navn
        String[] fullNameParts = fullName.split(" "); // split metode bruges her til at dele det fulde navn op med " "(mellemrum)
        String firstName = fullNameParts[0].charAt(0) + ".";
        String middleName = fullNameParts[1].charAt(0) + ".";
        String lastName = fullNameParts[2];
        System.out.println(firstName + " " + middleName + " " + lastName);


        // Classes and Objects - Car & Driver
        Car car1 = new Car("BMW", 660000);
        System.out.println("car: " + car1.getModel() + " " + "price: " + car1.getPrice());
        car1.stop();
        car1.start();
        car1.move();

        Driver driver1 = new Driver("Ray", 21);
        System.out.println("Driver: " + driver1.getName() + " " + "age: " + driver1.getAge());
        driver1.drive();

        // Classes and Objects - Employees
        Employee employee1 = new Employee("Annegrete", "Jensen", 25000);
        Employee employee2 = new Employee("Alberte", "Mortensen", 20000);
        System.out.println("Annegretes yearly salary: " + employee1.getYearlySalary());
        System.out.println("Albertes yearly salary: " + employee2.getYearlySalary());
        // 10% raise in salary
        System.out.println("Annegretes 10% raise: " + employee1.getYearlySalary() * 1.1);
        System.out.println("Albertes 10% raise: " + employee2.getYearlySalary() * 1.1);

    }

        // Methods 2 - Define two methods to print the maximum and minimum number respectively among three numbers
    public static int maxNum(int num1, int num2, int num3) {
            return Math.max(Math.max(num1, num2), num3);     // max() metoden tager kun to tal --> derfor bruger man nested max() metode
        }
    public static int minNum(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);         // min() metoden tager kun to tal --> derfor bruger man nested min() metode
    };

}













