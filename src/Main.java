import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Methods 1
        Scanner vote = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = Integer.parseInt(vote.nextLine());


        if((age) >= 18) {
            System.out.println("You are eligible to vote");
        } if ((age) < 18){
            System.out.println("You are not eligible to vote");
        }

        // Methods 2


    }
}
